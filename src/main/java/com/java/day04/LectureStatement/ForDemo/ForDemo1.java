package com.java.day04.LectureStatement.ForDemo;

public class ForDemo1 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out
				.println("--------------------------------------------------");
		// 上面这种做法不好,代码的重复度太高,所以呢，我们用循环改进
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("*-------------------------------------------*");
		// 从0开始
		for (int x = 0; x < 10; x++) {
			System.out.println(x + 1);

		}

	}
}
