package main

import "fmt"

/**
* 控制台输出
 */
func main() {
	//fmtScanLn()
	fmtScanF()
}

func fmtScanLn() {
	var age = ""
	var name = ""
	var sex = ""
	// 读取单行文本, 按回车结束
	//fmt.Scanln(&age, &name, &sex)
	fmt.Scanln(&age)
	fmt.Scanln(&name)
	fmt.Scanln(&sex)
	fmt.Println("我的年龄是：", age)
	fmt.Println("我的名字是：", name)
	fmt.Println("我的性别是：", sex)
}

func fmtScanF() {
	var name string
	var age byte
	var sex bool

	fmt.Scanf("%s %d %t", &name, &age, &sex)
	fmt.Println("我的名字是：", name)
	fmt.Println("我的年龄是：", age)
	fmt.Println("我的性别是：", sex)
}
