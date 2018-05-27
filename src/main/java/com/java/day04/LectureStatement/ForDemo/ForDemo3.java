package com.java.day04.LectureStatement.ForDemo;

/*
 *需求：
 *	A:求。1-100之和
 *	B:求出1-100之间偶数和
 *	C:求出1-100之间奇数和
 */
public class ForDemo3 {
	public static void main(String[] args) {
		// 求1-100的和
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = i + sum;

		}
		System.out.println("1-100之和是:" + sum);
		System.out
				.println("------------------------------------------------------------------------");

		// 求出1-100 偶数的和
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}

		}
		System.out.println("1-100偶数之和是：" + sum2);
		System.out.println("------------------");

		// 方式2
		int sum3 = 0;

		for (int x = 0; x <= 100; x += 2) {
			sum3 += x;
		}

		System.out.println("1-100偶数之和是：" + sum3);
		System.out.println("------------------");
		// 求出1-100之间奇数和
		int sum4 = 0;
		for (int i = 0; i <= 100; i++) {
			if ((i + 1) % 2 == 0) {
				sum4 += i;
			}
		}
		System.out.println("1-100基数之和是：" + sum4);
		System.out.println("------------------");
	}

}
