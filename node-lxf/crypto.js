'use strict'

//crypto模块的目的是为了提供通用的加密和哈希算法。用纯JavaScript代码实现这些功能不是不可能，但速度会非常慢。
//Nodejs用C/C++实现这些算法后，通过cypto这个模块暴露为JavaScript接口，这样用起来方便，运行速度也快

//MD5是一种常用的哈希算法，用于给任意数据一个“签名”。这个签名通常用一个十六进制的字符串表示
	//MD5 md5 sha1 sha256 sha512

const crypto = require('crypto');

const hash = crypto.createHash('md5');

//update()方法默认字符串编码为UTF-8，也可以传入Buffer
hash.update('123');
hash.update('789')


console.log(hash.digest('hex')); // 55587a910882016321201e6ebbc9f595


const sha1 = crypto.createHash('sha1');
sha1.update('123');
sha1.update('789')

console.log(sha1.digest('hex')); // c75c6abebd904a02e62cfe65e0a82dd55414a217



const sha256 = crypto.createHash('sha256');
sha256.update('123');
sha256.update('789')

console.log(sha256.digest('hex')); // b7158b64a98516b31d0c23609f69265a868c594dda5b3c8da9e13159e209c9b6


const sha512 = crypto.createHash('sha512');
sha512.update('123');
sha512.update('789')

console.log(sha512.digest('hex')); // 512位

//Hmac算法也是一种哈希算法，它可以利用MD5或SHA1等哈希算法。不同的是，Hmac还需要一个密钥：
const hmac = crypto.createHmac('sha256', 'secret-key');

hmac.update('123');
hmac.update('789')

console.log(hmac.digest('hex')); //89c2be954cde4083cc585c7595a4a114ebf152da5a4fff273ffdacfe7146c6aa
//只要密钥发生了变化，那么同样的输入数据也会得到不同的签名，因此，可以把Hmac理解为用随机数“增强”的哈希算法。


//AES是一种常用的对称加密算法，加解密都用同一个密钥

function aesEncrypt(data, key) {
    const cipher = crypto.createCipher('aes192', key);
    var crypted = cipher.update(data, 'utf8', 'hex');
    crypted += cipher.final('hex');
    return crypted;
}

function aesDecrypt(encrypted, key) {
    const decipher = crypto.createDecipher('aes192', key);
    var decrypted = decipher.update(encrypted, 'hex', 'utf8');
    decrypted += decipher.final('utf8');
    return decrypted;
}

var data = 'Hello, this is a secret message!';
var key = 'Password!';
var encrypted = aesEncrypt(data, key);
var decrypted = aesDecrypt(encrypted, key);

console.log('Plain text: ' + data);
console.log('Encrypted text: ' + encrypted);
console.log('Decrypted text: ' + decrypted);
/*
注意到AES有很多不同的算法，如aes192，aes-128-ecb，aes-256-cbc等，AES除了密钥外还可以指定IV（Initial Vector），
不同的系统只要IV不同，用相同的密钥加密相同的数据得到的加密结果也是不同的。加密结果通常有两种表示方法：
hex和base64，这些功能Nodejs全部都支持，但是在应用中要注意，如果加解密双方一方用Nodejs，
另一方用Java、PHP等其它语言，需要仔细测试。如果无法正确解密，要确认双方是否遵循同样的AES算法，
字符串密钥和IV是否相同，加密后的数据是否统一为hex或base64格式。
*/


//DH算法是一种密钥交换协议，它可以让双方在不泄漏密钥的情况下协商出一个密钥来




















