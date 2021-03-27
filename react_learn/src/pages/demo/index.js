import React from "react";
import RouteWithSubRoutes from '@/commponents/RouteWithSubRoutes'

function Tacos({routes}) {
  return (
    <div>
      <h2>Demo</h2>
      <RouteWithSubRoutes routes={routes}/>
    </div>
  );
}

export default Tacos
