// A special wrapper for <Route> that knows how to
// handle "sub"-routes by passing them in a `routes`
// prop to the component it renders.
import {Route, Redirect, Switch} from "react-router-dom";
import React from "react";

class RouteWithSubRoutes extends React.Component {
  render() {
    console.log(this.props)
    return (
      <Switch>
        {this.props.routes.map((route, i) => (
          <Route
            path={route.path}
            key={i}
            exact={route.exact}
            strict={route.strict}
            render={(props) => {
              const auth = false;
              // console.log(route);
              // console.log(props);
              if (route.meta && route.meta.requireAuth) {
                if (auth) {
                  if (route.redirect) {
                    return (
                      <Redirect to={{pathname: route.redirect}}/>
                    )
                  } else {
                    return (
                      <route.component {...props} routes={route.routes}/>
                    )
                  }
                } else {
                  return (<Redirect
                    to={{
                      pathname: "/login",
                      state: {from: props.location}
                    }}
                  />)
                }
              } else {
                if (route.redirect) {
                  return (<Redirect to={route.redirect}/>)
                } else {
                  return (
                    <route.component {...props} routes={route.routes}/>
                  )
                }
              }
            }
            }
          />)
        )}
      </Switch>
    );
  }
}

export default RouteWithSubRoutes
