/**
 * TypeScript高级类型-partial[部分的]
 *
 * */
interface A {
  name: string;
  age: number;
}

type B = Partial<A>;

const bb: B = {}
/**
 * 经过 partial 转换得到
 *
 * */
type BB = {
  name?: string;
  age?: number;
}

