import {Link, Switch} from "react-router-dom";
import React from "react";
import RouteWithSubRoutes from '@/commponents/RouteWithSubRoutes'

function Tacos({routes}) {
  return (
    <div>
      <h2>Tacos</h2>
      <ul>
        <li>
          <Link to="/tacos/bus">Bus</Link>
        </li>
        <li>
          <Link to="/tacos/cart">Cart</Link>
        </li>
      </ul>

      <RouteWithSubRoutes routes={routes}/>
    </div>
  );
}

export default Tacos
