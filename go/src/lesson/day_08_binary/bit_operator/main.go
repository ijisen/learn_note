package main

import "fmt"

/*
位运算

======基础知识 ====
【原码】
【补码】
【反码】
对于有符号的数据
1、 0表示正数，1表示负数
2、正数的原码 补码  反码都一样
3、负数的反码= 符号位不变，其它位 0->1 1->1
eg: 原码 = 1000 0001

	反码 = 1111 1110

4、负数的补码 = 反码 +1
eg: 原码 = 1000 0000

	反码 = 1111 1111
	补码 = 10001 0000 0000

5、0 补码 反码都是0

6、在计算机运算时，都是以【补码】的方式来运算的 【重点】

==========
【按位与】 & 都为1，结果为1，否则为0
【按位或】 | 有一个为1，结果为1，否则为0
【按位异或】 ^  一个为0一个为1，结果为1，否则为0

==========
【右位移】 >> 低位溢出，符号位不变，并用符号位补溢出的高位 (即：高位用符号位补足位数，低位移除多少位，高位就不足多少)
【左位移】 << 符号位不变，低位补0
*/
func main() {
	//var intA = 1 >> 2

	/*
		2的原码:		0000 0010
		3的原码:		0000 0011
		2&3      	0000 0010
	*/
	// 2
	fmt.Println(2 & 3)

	/*
		2的原码:		0000 0010
		3的原码:		0000 0011
		2|3      	0000 0011
	*/
	// 3
	fmt.Println(2 | 3)

	/*
		2的原码:		0000 0010
		3的原码:		0000 0011
		2^3      	0000 0001
	*/
	// 1
	fmt.Println(2 ^ 3)

	/* 1 2 4 8 16 32 64
	-33的原码:		1010 0001
	-33的反码:		1101 1110
	-33的补码:		1101 1111

	*/
	/**
	-33的补码:		1101 1111
	50的原码:		0011 0010
	50&-33的补码      	0001 0010
	*/
	// 18
	fmt.Println(50 & -33)

	/**
	-33的补码:		1101 1111
	50的原码:		0011 0010
	50|-33的补码     1111 1111
	50|-33的反码     1111 1110
	50|-33的原码     1000 0001
	*/
	// -1
	fmt.Println(50 | -33)
	/**
	-33的补码:		1101 1111
	50的原码:		0011 0010
	50^-33补码     	1110 1101
	50^-33的反码     1110 1100
	50^-33的原码     1001 0011
	*/
	// -19
	fmt.Println(50 ^ -33)
	fmt.Printf("%b \n", -33)
	/** 1 2 4 8 16
	-20的原码:		1001 0100
	-20的反码:		1110 1011
	-20的补码:		1110 1100
	右移位2位补码:	1111 0011
	右移位2位反码:	1111 1010
	右移位2位原码:	1000 0101

	*/
	// -5
	fmt.Println(-20 >> 2)
	// 0 0000 0001 => 0000 0000
	fmt.Println(1 >> 2)
	// 4 0000 0001 => 0000 0100
	fmt.Println(1 << 2)

	/** 1 2 4 8 16 32 64 128 256 512 1024
	 2 16 64 128   1024
	-1234
	原码:		1100 1101 0010
	反码:		1011 0010 1101
	补码:		1011 0010 1110
	移位补码:	1111 1011 0010
	移位反码:	1111 1011 0001
	移位原码:	1000 0100 1110  2 4 8 64

	*/
	// -78
	fmt.Println(-1234 >> 4)
}
