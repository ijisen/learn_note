import { Button, Result } from 'antd';
import React from 'react';
// 但是还没发布，先来个简单的。

const NoFoundPage = (router) => {
  return (
    <Result
      status="404"
      title="404"
      subTitle="Sorry, the page you visited does not exist."
      extra={
        <Button type="primary" onClick={() => router.history.push('/')}>
          Back Home
        </Button>
      }
    ></Result>
  );
}

export default NoFoundPage;
