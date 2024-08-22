package main

import (
	"fmt"
	"strconv"
)

/*
	算数运算符

1、在go中， ++ -- 只能独立使用
1、在go中， ++ -- 只能写在变量的后面，不能写在前面
*/
func main() {
	var intA = 10
	var intB = 21

	fmt.Println("+ : " + strconv.FormatInt(int64(intB+intA), 10))
	fmt.Println("- : " + strconv.FormatInt(int64(intA-intB), 10))
	fmt.Println("% :", intB%intA)
	fmt.Println("intA * intB = ", intB*intA)

	intA++

	// syntax error: unexpected ++
	// ++intB

	fmt.Println(intA)
	var intC = 0
	// ',', ';', new line or '}' expected, got '--'
	// ++ -- 只能独立使用
	// intC = intA--
	fmt.Println(intC)

	demo1(10)
}

func demo1(temp float64) {
	var temp2 = 5.0 / 9 * (temp - 100)
	fmt.Println("当前华氏温度位：", temp2)
}
