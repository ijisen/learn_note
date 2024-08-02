package main

import "fmt"

/**
golang 指针类型
*/

func main() {
	basicPoint()
}

/**
基本数据类型的指针

基本数据类型中，变量存的就是值，也叫值类型 eg: var a = 10;  10就是值类型

获取变量的地址： &

指针类型： 指针变量存的是一个地址，这个地址指向空间存的值


获取指针指向的值： *

指针地址也有数据类型限制，不可随意更改

值类型包含： 基本数据类型 byte init uint float bool string  和  数组  结构体（struct）
*/

func basicPoint() {
	// 基本数据类型的值也是存放在一个地址中的，通过指针进行获取
	var a int8 = 10
	// a的地址是：  0xc00000a0c8
	fmt.Println("a的地址是： ", &a)

	// 含义
	// ptr 是一个指针变量
	// ptr 的类型是 *int8
	// ptr 的值是 &a
	// 其实就是把a的地址赋值给了ptr
	var ptr *int8 = &a
	// 0xc00000a0c8
	// *int8 0xc00000a0c8
	fmt.Printf("ptr的类型是: %T； ptr的值是： %v \n", ptr, ptr)
	// 获取ptr 指针指向的值
	fmt.Println(*ptr)

	var b int8 = 10
	// 0xc00000a0c9
	fmt.Println("b的地址是： ", &b)

	var c = a
	// 0xc00000a0ca
	fmt.Println("c的地址是： ", &c)
}
