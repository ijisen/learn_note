/**
 * TypeScript高级类型-Required
 *
 * */
interface A {
  name?: string;
  age?: number;
}

type B = Required<A>;

const bb:B = {
  name: 'name',
  age: 25
}
/**
 * 经过 Required 转换得到
 *
 * */
type BB = {
  name: string;
  age: number;
}

