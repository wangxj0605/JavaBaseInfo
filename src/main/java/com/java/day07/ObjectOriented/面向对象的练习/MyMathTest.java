package com.java.day07.ObjectOriented.面向对象的练习;

import java.util.Scanner;

/*
 定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
 */
class MyMath {
	// 加法
	public int add(int a, int b) {
		return a + b;

	}

	// 减法
	public int sub(int a, int b) {
		return a - b;

	}

	// 乘法
	public int mul(int a, int b) {
		return a * b;

	}

	// 除法
	public int div(int a, int b) {
		return a / b;
	}

}

public class MyMathTest {
	public static void main(String[] args) {

		// 创建键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		// 创建对象
		MyMath mm = new MyMath();
		System.out.println("加法结果：" + mm.add(a, b));
		System.out.println("减法结果：" + mm.sub(a, b));
		System.out.println("乘法结果：" + mm.mul(a, b));
		System.out.println("除法结果：" + mm.div(a, b));

	}
}
