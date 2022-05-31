/**
 *
 * TypeScript高级类型-Pick[挑选]
 * Pick 用于拣选出我们需要关心的属性，
 *
 * */
interface User {
  id: number | string;
  name: string;
  age: number;
}

type pickUser = Pick<User, 'name' | 'age'>;
// 等价于
type pickUser2 = {
  name: string;
  age: number;
}
const aa: pickUser = {
  name: '123',
  age: 25,
}
