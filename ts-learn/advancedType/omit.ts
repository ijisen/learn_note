/**
 * TypeScript高级类型-Omit[忽略]
 *与Pick相反，Pick用于拣选出我们需要关心的属性，而Omit用于忽略掉我们不需要关心的属性
 * */
interface User {
  id: number | string;
  name: string;
  age: number;
}

type pickUser = Omit<User, 'id'>;
// 等价于
type pickUser2 = {
  name: string;
  age: number;
}
const aa: pickUser = {
  name: '123',
  age: 25,
}
