import React from "react";


function ES5({props}) {
  console.log(this);
  return <h3>ES5 加载组件方式</h3>;
}

export default ES5
