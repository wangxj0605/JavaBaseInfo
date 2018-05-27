package com.java.day04.LectureStatement.ForDemo;

/*
 *需求：求出1-10之间数据之和

 *分析：
 *	0+1=1
 *		1+2=3
 *			3+3=6
 *				6+4=10
 *					10+5=15
 *						 ...
 *						 
 *	由此可见我们要定义两个变量：
 *		一个变量用于存储第一个加数，第一个加数其实保存的是以前的所有数据和。默认初始化值应该是0。
 **		一个变量用于存储第二个加数，第二个加数其实就是每次的数据变化的值。
 *		
 *和思想。		
 */
public class ForDemo2 {
	public static void main(String[] args) {
		// 原始写法
		System.out.println(2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);

		// for循环写法
		// 定义第一个加数
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			// 这里的x其实是第二个数相加
			sum = sum + i;

		}
		System.out.println("sum:" + sum);

	}
}
