package main

import (
	"fmt"
	"strconv"
)

func main() {
	//basicDataExchange()
	//basicDataExchangeStr()
	strExchangeBasicData()
}

/*
基本数据类型的转换
golang 数据类型都是显示转换，不能自动转换，无论精度高低
golang 高精度转低精度，编译不会报错， 但容易溢出，所以高精度转低精度需要保证不会溢出
*/
func basicDataExchange() {

	fmt.Println("基本数据类型的转换")

	var intA = 1

	fmt.Println(intA)

	var intB = int8(intA)

	fmt.Println(intB)

	var intC = int32(intA)
	fmt.Println(intC)

	var floatA = float64(intA)
	fmt.Println(floatA)

	var intD int16 = 20

	var intF = int32(intA) + int32(intD)
	fmt.Println(intF)
}

/*
基本数据类型转String
--> 1、 fmt.Sprintf();
--> 2、 strconv
*/
func basicDataExchangeStr() {
	var a = 800

	var b = false

	var c = 'h'

	var floatA = 12.89

	fmt.Println(a, b, c)
	// float64
	fmt.Printf("%T //n", floatA)

	var d = fmt.Sprintf("%d", a)
	// int
	fmt.Println(d)
	// 800
	fmt.Printf("d 的类型是: %T, 值是: %v \n", d, d)
	// 值的默认格式表示
	fmt.Printf("值的默认格式表示: %v \n", d)
	// 类似%v，但输出结构体时会添加字段名
	fmt.Printf("类似%%v，但输出结构体时会添加字段名: %+v \n", d)
	// 值的Go语法表示
	fmt.Printf("值的Go语法表示: %#v \n", d)
	fmt.Printf("值的类型的Go语法表示: %T \n", d)
	fmt.Printf("百分号: %% \n")

	// 方式2 转换  strconv
	fmt.Printf("bool 转字符串， 我的类型是：%T， 我的值是： %v \n", strconv.FormatBool(false), strconv.FormatBool(false))
	var strFloatA = strconv.FormatFloat(floatA, 'f', 4, 64)
	fmt.Printf("float 转字符串， 我的类型是：%T， 我的值是： %v \n", strFloatA, strFloatA)
	fmt.Println(strconv.FormatInt(int64(a), 10))
	fmt.Println(strconv.FormatUint(uint64(a), 10))
}

/*
String类型转 基本数据
--> 2、 strconv

string 转基本数据类型时，需要注意原始数据类型 以及 数据范围是否会溢出
*/
func strExchangeBasicData() {
	var strInt = "800"

	var strBool = "false"

	var strFloat = "12.89"

	// 方式2 转换  strconv
	var boolA, _ = strconv.ParseBool(strBool)
	fmt.Printf("字符串 转 bool， 我的类型是：%T， 我的值是： %v \n", boolA, boolA)
	var floatA, _ = strconv.ParseFloat(strFloat, 32)
	fmt.Printf("字符串 转 float， 我的类型是：%T， 我的值是： %v \n", floatA, floatA)
	var intA, err = strconv.ParseInt(strInt, 10, 8)
	// strconv.ParseInt: parsing "800": value out of range
	fmt.Println(err)
	// TODO: 虽然超出范围报错了，但还是会转出值： 127
	fmt.Printf("字符串 转 int， 我的类型是：%T， 我的值是： %v \n", intA, intA)
	var uintA, _ = strconv.ParseUint(strInt, 10, 32)
	fmt.Printf("字符串 转 int， 我的类型是：%T， 我的值是： %v \n", uintA, uintA)
}
