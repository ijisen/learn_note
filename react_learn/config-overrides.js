const {
  override,
  fixBabelImports,
  addWebpackAlias,
  addLessLoader
} = require('customize-cra');

const path = require('path');

function resolve(dir) {
  return path.join(__dirname, '.', dir)
}

/*module.exports = function override(config, env) {
  config.resolve.alias = {
    '@': resolve('src')
  };
  return config;
}*/
module.exports = override(
  fixBabelImports('import', {
    libraryName: 'antd',
    libraryDirectory: 'es',
    style: true,
  }),
  addLessLoader({
    javascriptEnabled: true,
    modifyVars: {

    }
  }),
  addWebpackAlias({
    '@': resolve('src')
  })
);
