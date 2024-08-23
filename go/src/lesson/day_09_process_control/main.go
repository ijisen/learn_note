package main

import "fmt"

/*
*

流程控制
三大类：
---->	顺序控制
---->	分支控制
---->	循环控制
*/
func main() {

	var age uint8

	fmt.Scanln(&age)

	fmt.Println(age)

	if age > 18 {
		fmt.Println("还钱")
	} else {
		fmt.Println("打钱")
	}

}
