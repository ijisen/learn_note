'use client'
import React, { useEffect } from "react";
import { Observable } from 'rxjs';

/**
 * Rxjs:
 *  Think of Rxjs as Lodash for events
 *  Rxjs本质是个工具库，处理的是事件。这里的events，可以称之为流。
 * observable
 * observer
 * subscription
 * */
export default function PageContent() {
  const rxjsDemo = () => {
    // 定义流
    const stream = new Observable(subscriber => {
      setTimeout(() => {
        subscriber.next([1, 2, 3])
      }, 500);

      setTimeout(() => {
        subscriber.next({ a: 1000 })
      }, 1000);

      setTimeout(() => {
        subscriber.next('end')
      }, 3000);

      setTimeout(() => {
        subscriber.complete();
      }, 4000)
    });

    // 启动流
    stream.subscribe({
      complete: () => console.log('done'),
      next: v => console.log(v),
      error: () => console.log('error')
    });

    stream.subscribe((x) => {
      console.log(`subscribe add`, x)
    })

    // 启动流
    const subscription = stream.subscribe({
      complete: () => console.log('subscription done'),
      next: v => console.log(`subscription`, v),
      error: () => console.log('subscription error')
    });

    // 1s后，关闭流
    setTimeout(() => {
      // 不会再执行 end  和 complete
      // 后续3000ms定时器，和4000ms定时器依旧会执行，
      // 只是因为流已经关闭，不会执行next的回调。
      subscription.unsubscribe();
    }, 1000);
  };
  useEffect(() => {
    rxjsDemo();
  }, [])
  return (
    <div className="p-6">
      <h1>Observable</h1>
    </div>
  )
}
