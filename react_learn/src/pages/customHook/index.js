/**
 * 自定义Hook
 * */
import React, { useState } from 'react'
import { Button } from 'antd'

function useNamed(initialState) {
  const [isOnline, setIsOnline] = useState(null);
  console.log(initialState, isOnline)
  function setCounter (data) {
    console.log(data);
    setIsOnline(data)
  }
  return [isOnline, setCounter]
}

function Index() {
  const [name, setName] = useNamed('name');

  function changeName() {
    setName(`${name}_${Date.now()}`)
  }

  return (
    <div>
      <h1>自定义HOOK</h1>
      <Button onClick={changeName}>修改名称</Button>
      <h1>{name}</h1>
    </div>
  )
}

export default Index
