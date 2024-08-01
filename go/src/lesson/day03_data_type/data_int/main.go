
package main

// import "fmt"
// import "unsafe"
import (
	"fmt"
	"unsafe"
)

/* 
证数数据类型
--> int  			32位系统4个字节/64位系统8个字节 
--> int8  		1个字节			8位			-128~127
--> int16			2个字节			16位    -32768~32767
--> int32			4个字节			32位		2^31 - 2^31-1
--> int64			8个字节			64位		2^63 - 2^63-1
--> uint			32位系统4个字节/64位系统8个字节
--> uint8			4个字节			8位			0~255
--> uint16		2个字节			16位    0~65535
--> uint32		4个字节			32位		0~32-1  等价于 rune
--> uint64		8个字节			64位		0~64-1
--> byte			1个字节			8位   	等价于 uint8，要储存字符时使用
--> rune			4个字节			32位   	等价于 uint32,表示一个unicode码

使用注意事项：
1、未申明类型时，默认为int类型， eg: var a = 100; fmt.Printf(%T n1)
*/
func main () {
 fmt.Println("整数类型的使用")

	fmt.Println("\n=========int 8=========")
	var int_a int8
	fmt.Println(int_a)

	int_a = -128

	fmt.Println(int_a)

	fmt.Println("\n=========uint 8=========")
	var uint_a uint8
	fmt.Println(uint_a)
	uint_a = 255
	fmt.Println(uint_a)

	fmt.Println("\n=========rune 等价于 uint32=========")
	var rune_a rune
	fmt.Println(rune_a)
	rune_a = 256
	fmt.Println(rune_a)

	fmt.Println("\n=========byte 等价于 uint8=========")
	var byte_a byte
	fmt.Println(byte_a)
	byte_a = 'a'
	// 97
	fmt.Println(byte_a)
	// 打印数据类型  uint8
	fmt.Printf("%T \n", byte_a)
	//var n2 int64
	// n2 = 10
	// 查看变量占用字节的大小  和 数据类型
	fmt.Println(unsafe.Sizeof(rune_a))
	fmt.Printf("%T  fsdf  %d", byte_a, unsafe.Sizeof(rune_a))
}
