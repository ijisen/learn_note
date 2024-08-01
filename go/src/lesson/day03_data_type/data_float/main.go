package main

import (
	"fmt"
	"unsafe"
)

/* 
	浮点类型

	float32  单精度  4个字节   取值范围 -3.403E38 ~ 3.403E38
	float64  双精度  8个字节， 取值范围 -1.798E308 ~ 1.798E308 类似于其它语言的 double

	浮点数在计算机中存储的方式：
-->	符号位 + 指数位 + 尾数位
-->		+
-->		-				

使用说明：
1、浮点型数据都会有精度损失的问题存在， 使用时需要注意
2、float64 的精度比 float32 高，一般优先使用float64，减少精度损失的概览
3、未申明类型时，默认为 float64
4、浮点类型的表示方式
--> 科学计数法  1.2E10
--> 十进制  54.04
*/
func main () {
  fmt.Println("浮点类型的使用")

	var float32_a float32 = -123.0000901
	var float64_a float64 = -123.0000901
	// -123.00009 会精度损失
	fmt.Println(float32_a)
	// -123.0000901
	fmt.Println(float64_a)

	// 默认为： float64
	var num_a = 5.5

	fmt.Printf("%T， 占用字节 %d \n", num_a, unsafe.Sizeof(num_a))


	// 十进制表示浮点型数据
	fmt.Println("十进制表示浮点型数据")
	var num_b = 10
	var num_c = .453453
	fmt.Println(num_b, num_c)

}