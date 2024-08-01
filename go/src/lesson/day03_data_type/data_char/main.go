package main

import (
	"fmt"
	// "unsafe"
)

/* 
	字符类型
	golang 中没有专门的字符类型，单个字符时使用byte来保存
	golang 默认的字符类型为 UTF-8
*/
func main () {
  fmt.Println("字符类型")

	var byte_a byte = 255
	fmt.Println(byte_a)
	fmt.Printf("%T", byte_a)

	var int_a int8 = 127
	fmt.Println(int_a)

	var byte_b byte = '呗'
	fmt.Println(byte_b)
	
}