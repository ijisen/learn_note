
interface Obj {
  name: string;
  age: number;
  [props: string]: any
}
const obj:Obj = {
  name: 'tomi',
  age: 25
}

console.log(obj['name']);
console.log(obj.name);
function getAttr (key:string) {
  console.log(obj[key])
}
