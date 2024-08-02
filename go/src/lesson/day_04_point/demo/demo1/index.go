package main

import "fmt"

func main() {
	var a = 10

	fmt.Printf("我是原始数据 %v, 我的指针地址是： %v \n", a, &a)
	getPoint(a)

	resetValByPoint(a)

	fmt.Printf("我是新值，为什么没有打印？ %v", a)

	var b uint64 = 28
	fmt.Printf("我是原始数据 %v, 我的指针地址是： %v \n", b, &b)
	var ptrB *uint64 = &b

	fmt.Printf("我是原始数据 %v, 我的指针地址是： %v \n", *ptrB, ptrB)

	var byteA byte = 'a'
	fmt.Printf("我是原始数据 %v, 我的指针地址是： %v \n", byteA, &byteA)
	var ptrByteA = &byteA

	fmt.Printf("我是原始数据 %v, 我的指针地址是： %v \n", *ptrByteA, ptrByteA)

}

func getPoint(num int) {

	fmt.Printf("我是入参 %v， 我的指针地址是： %v \n", num, &num)
}

func resetValByPoint(num int) {
	fmt.Printf("我是入参 %v， 我的指针地址是： %v \n", num, &num)
	var ptr = &num
	*ptr = 50
	fmt.Printf("我是新值 %v， 我的指针地址是： %v \n", num, ptr)
}
