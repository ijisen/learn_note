
/**

变量：
--> 变量申明方式
----> 1、 var username string  username="timi"  先申明类型，再赋值
----> 2、 var age=20      申明并赋值， 类型推导方式
----> 3、 var username string    不赋值
----> 4、 name := "tong" 等价于方式1

--> 变量使用注意事项
----> 变量类型申明后，不可以更改
----> 变量类型申明后，赋值范围不可更改


 

*/
package main

import "fmt"

func main () {
	varApMethod()
}

func varApMethod () {
	
	// 变量申明方式1
	var username string
	username = "timi"
	fmt.Println(username)

	// 变量申明方式2
	var age = 20
	fmt.Println(age)

	// 变量申明方式3
	gender := "男"
	fmt.Println(gender)

	// 申明方式4
	var address string
	fmt.Println(address)
}