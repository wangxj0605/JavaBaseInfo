package com.java.day04.LectureStatement.DoWhile;

/*
 *do...while循环的基本格式：
 *	do {
 *		循环体语句;
 *	}while(判断条件语句);
 *	
 *	扩展格式；
 *	初始化语句;
 *	do {
 *		循环体语句;
 *		控制条件语句;
 *	}while(判断条件语句);
 */
public class DoWhileDemo {
	public static void main(String[] args) {
		// 输出10次helloworld
		int i = 0;
		do {
			System.out.println("helloworld");
			i++;
		} while (i < 10);
		System.out.println("------------------------------------------------");

		// 求1-100的和
		int sum = 0;
		int x = 1;
		do {
			sum += x;
			x++;
		} while (x <= 100);
		System.out.println(sum);
	}
}
