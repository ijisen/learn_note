package main

import (
	"fmt"
)

/*
	其它运算符

1、& 获取变量的地址（指针地址）
1、* 获取地址的指
*/
func main() {
	var a = 10

	var ptr = &a

	fmt.Println("int A 的地址是： ", &a)
	fmt.Println(ptr)
	fmt.Println(*ptr)

}
