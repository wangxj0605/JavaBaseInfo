package com.java.day04.LectureStatement.ForDemo;

/*
 需求：求1-10的阶乘。

 什么是阶乘呢?
 n! = n*(n-1)! 规则
 n! = n*(n-1)*(n-2)*...*3*2*1

 求和思想。
 求阶乘思想。
 */
public class ForDemo4 {
	public static void main(String[] args) {

		long jc = 1;
		// 可以直接从2开始 因为1*1没意思
		for (int i = 2; i <= 10; i++) {
			jc *= i;
		}
		System.out.println("1-10的阶乘是：" + jc);
	}

}
