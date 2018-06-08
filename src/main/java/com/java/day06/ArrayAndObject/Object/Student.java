package com.java.day06.ArrayAndObject.Object;

/*
 事物：
 属性	事物的信息描述
 行为	事物的功能

 类：
 成员变量	事物的属性
 成员方法	事物的行为

 定义一个类，其实就是定义该类的成员变量和成员方法。

 案例：我们来完成一个学生类的定义。

 学生事物：
 属性：姓名，年龄，地址...
 行为：学习，吃饭，睡觉...

 把事物要转换为对应的类：

 学生类：
 成员变量：姓名，年龄，地址...
 成员方法：学习，吃饭，睡觉...

 成员变量：和以前变量的定义是一样的格式，但是位置不同，在类中方法外。
 成员方法：和以前的方法定义是一样的格式，但是今天把static先去掉。

 首先我们应该定义一个类，然后完成类的成员。
 */
//这是我的学生类
public class Student {
	// 定义变量
	// 姓名
	String name;
	// 年龄
	int age;
	// 地址
	String address;

	// 定义方法
	// 学习的方法
	public void study() {
		System.out.println("学生爱学习");
	}

	// 吃饭的方法
	public void eat() {
		System.out.println("学习饿了,要吃饭");
	}

	// 睡觉的方法
	public void sleep() {
		System.out.println("学习累了,要睡觉");
	}
}
