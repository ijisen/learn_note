/**
 * Restful 接口文档规范
 */

const httpCode = {
  /**
   * 操作成功状态码
   * 操作成功状态码 [2XX]
   * */
  // 服务器成功返回请求的数据。
  200: 'OK',
  // 新建或修改资源成功。
  // POST =》 CREATE
  // PUT =》 OK 更新全部信息
  // PATCH =》 OK 更新部分信息
  201: 'Created|OK|OK',
  // 一个请求已经进入后台排队（异步任务）。
  202: 'Accepted',
  // 删除资源成功。
  204: 'No Content',
  /**
   * 客户端错误状态码
   * 客户端状态码为4xx形式，主要用来提示客户端相关错误。
   * */
  // 服务器不能解析客户端的请求
  400: 'Bad Request',
  // 用户未提供身份验证凭据，或者没有通过身份验证。（令牌、用户名、密码错误）。（即未登录）
  401: 'Unauthorized',
  // 用户不具有该资源访问权限（已登录）
  403: 'Forbidden',
  // 	请求资源不存在或不可用（临时）
  404: 'Not Found',
  // 用户不具有该HTTP方法的权限（已登录）
  405: 'Method Not Allowed。',
  // 用户请求的格式不可得（比如用户请求JSON格式，但是只有XML格式）。
  406: 'Not Acceptable。',
  // 所请求资源不存在或不可用（永久）
  410: 'Gone',
  // 客户端要求返回的格式不支持，如接口只支持JSON，但客户端要求返回XML
  415: 'Unsupported Media Type',
  // 客户端上传的附件无法处理
  422: 'Unprocessable Entity',
  // 客户端的请求次数超过限额
  429: 'Too Many Request',
  /**
   * 服务端错误状态码
   * 服务端错误状态码是5xx的形式。但是出于保护的原因，一般情况下，
   * 服务端不会向客户端泄露过多错误细节，所以总的来说，服务端错误状态码在生产环境中只有两个是比较常用的。
   * */
  // 服务器发生错误，请检查服务器。
  500: 'Internal Server Error',
  // 服务不可用，服务器暂时过载或维护
  503: 'Service Unavailable'
};

const responseCode = {
  1000: '响应成功',
  // 参数错误 #1000～1999
  1001: '参数为空',
  1002: '参数不全',
  1003: '参数类型错误',
  1004: '参数无效',
// 用户错误 #2000～2999
  2000: '用户错误',
  2001: '用户不存在',
  2002: '未登录或登录超时',
  2003: '用户名或密码错误',
  2004: '用户账户已被禁用',
  2005: '用户已存在',
  2006: '验证码错误',
  2048: '用户登录超时',
// 业务错误 #3000～3999
  3000: '业务错误',
  3001: '系统业务出现问题',
// 系统错误 #4000～4999
  4000: '系统错误',
  4001: '系统内部错误',
// 业务错误 #5000～5999
  5000: '业务错误',
  5001: '数据未找到',
  5002: '数据有误',
  5003: '数据已存在',
// 接口错误 #6000～6999
  6000: '接口错误',
  6001: '系统内部接口调用异常',
  6002: '系统外部接口调用异常',
  6003: '接口禁止访问',
  6004: '接口地址无效',
  6005: '接口请求超时',
  6006: '接口负载过高',
  // 权限错误 #7000～7999
  7000: '权限错误',
  7001: '没有访问权限'
};
/**
 * 发生错误时，如未登录时，需要修改http状态码，不要仍然200状态码，把错误信息放在数据体里面，
 * 正确的做法是，状态码反映发生的错误，具体的错误信息放在数据体里面返回。
 * HTTP/1.1 401 Unauthorized
 * Content-Type: application/json
 * {
 *    "message": "Unauthorized",
 *  }
 *
 * */


/**
 * GET /collection：返回资源对象的列表（数组）
 * GET /collection/resource：返回单个资源对象
 * POST /collection：返回新生成的资源对象
 * PUT /collection/resource：返回完整的资源对象
 * PATCH /collection/resource：返回完整的资源对象
 * DELETE /collection/resource：返回一个空文档
 * */

const response = {
  code: 1000,
  message: 'ok',
  data: {}
}
