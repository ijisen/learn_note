import React from 'react';
import {Card, Typography, Alert} from 'antd';

const CodePreview = ({children}) => (
  <pre
    style={{
      background: '#f2f4f5',
      padding: '12px 20px',
      margin: '12px 0',
    }}
  >
    <code>
      <Typography.Text copyable>{children}</Typography.Text>
    </code>
  </pre>
);

export default () => (
  <Card>
    <Alert
      message="umi ui 现已发布，欢迎使用 npm run ui 启动体验。"
      type="success"
      showIcon
      banner
      style={{
        margin: -12,
        marginBottom: 24,
      }}
    />
    <Typography.Text strong>
      <a target="_blank" rel="noopener noreferrer" href="https://pro.ant.design/docs/block">

      </a>
    </Typography.Text>
    <CodePreview>npx umi block list</CodePreview>
    <Typography.Text
      strong
      style={{
        marginBottom: 12,
      }}
    >
      <a
        target="_blank"
        rel="noopener noreferrer"
        href="https://pro.ant.design/docs/available-script#npm-run-fetchblocks"
      >
      </a>
    </Typography.Text>
    <CodePreview> npm run fetch:blocks</CodePreview>
  </Card>
);
