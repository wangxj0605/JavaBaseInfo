package com.java.day04.LectureStatement.While;

/*
 *练习：用while循环实现
 *左边：求出1-100之和
 *右边：统计水仙花数有多少个

 *初始化语句;
 *
 *while(判断条件语句) {
 *	 循环体语句;
 *	 控制条件语句;
 *}
 *for(初始化语句;判断条件语句;控制条件语句) {
 *	循环体语句;
 }

 */
public class WhileDemo1 {
	public static void main(String[] args) {
		// 求出1-100的和
		// 先用for循环
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;

		}
		System.out.println("1-100的和:" + sum);
		System.out.println("-------------------------------------------------");
		// while语句版本
		int sum2 = 0;
		int i = 1;
		while (i <= 100) {
			sum2 += i;
			i++;

		}

		System.out.println("sum2:" + sum2);
		System.out.println("--------");
	}
}
