'use client'
import React, { useEffect } from "react";
import { Subject } from 'rxjs';

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
    // 创建 Subject
    const subject = new Subject();

    // 订阅一个 observer
    subject.subscribe(v => console.log(`stream 1: ${v}`));

    subject.subscribe(v => console.log(`stream 2: ${v}`));

    setTimeout(() => {
      subject.subscribe(v => console.log(`stream 2: ${v}`))
    }, 1000)

    // stream 1 1 //立即输出
    // stream 2 1 //立即输出
    subject.next(1);

    // 延时3s产生数据3
    // stream 1 3 //3s后输出
    // stream 2 3 //3s后输出
    // stream 3 3 //3s后输出
    setTimeout(() => {
      subject.next(3);
    }, 3000);
  };
  useEffect(() => {
    rxjsDemo();
  }, [])
  return (
    <div className="p-6">
      <h1>Subject</h1>
    </div>
  )
}
