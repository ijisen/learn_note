import Link from "next/link";
import React from "react";

export default function Home() {
  const urlData = [
    { title: 'Demo', path: '/demo' },
    { title: 'Observable', path: '/observable' },
    { title: 'Subject', path: '/subject' },
  ]
  return (
    <main className="flex flex-col items-center justify-between box-border">
      <div className="z-10 w-full max-w-5xl items-center justify-between font-mono text-sm lg:flex">
        <ul className="pt-8">
          {
            urlData.map((item, index) => {
              return (
                <li className="p-2 hover:border-gray-300 hover:bg-gray-100 cursor-pointer"
                    key={index}>
                  <Link className="hover:text-orange-600 text-2xl"
                        href={item.path}>{item.title}</Link>
                </li>
              )
            })
          }
        </ul>
      </div>

      <div className="pt-10 grid text-center lg:grid-cols-4 lg:text-left">
        <a
          href="https://nextjs.org/docs"
          className="group rounded-lg border border-transparent px-5 py-4 transition-colors hover:border-gray-300 hover:bg-gray-100 hover:dark:border-neutral-700 hover:dark:bg-neutral-800/30"
          target="_blank"
          rel="noopener noreferrer"
        >
          <h2 className={`mb-3 text-2xl font-semibold`}>
            Docs{' '}
            <span className="inline-block transition-transform group-hover:translate-x-1 motion-reduce:transform-none">
              -&gt;
            </span>
          </h2>
          <p className={`m-0 max-w-[30ch] text-sm opacity-50`}>
            Find in-depth information about Next.js features and API.
          </p>
        </a>

        <a
          href="https://tailwindcss.com/docs"
          className="group rounded-lg border border-transparent px-5 py-4 transition-colors hover:border-gray-300 hover:bg-gray-100 hover:dark:border-neutral-700 hover:dark:bg-neutral-800 hover:dark:bg-opacity-30"
          target="_blank"
          rel="noopener noreferrer"
        >
          <h2 className={`mb-3 text-2xl font-semibold`}>
            tailwindcss{' '}
            <span className="inline-block transition-transform group-hover:translate-x-1 motion-reduce:transform-none">
              -&gt;
            </span>
          </h2>
          <p className={`m-0 max-w-[30ch] text-sm opacity-50`}>
            Learn about Next.js in an interactive course with&nbsp;quizzes!
          </p>
        </a>

      </div>
    </main>
  )
}
