package com.java.day04.LectureStatement.JumpControl;

/*
 *return:返回

 *其实它的作用不是结束循环的，而是结束方法的。
 */
public class ReturnDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				System.out.println("退出");
				return;
			}
			System.out.println(i);
		}
		System.out.println("over");
	}
}
