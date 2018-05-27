package com.java.day04.LectureStatement.While;

/*
 需求：统计水仙花数有多少个
 */
public class WhileDemo2 {
	public static void main(String[] args) {
		// for循环版本
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if (ge * ge * ge + bai * bai * bai + shi * shi * shi == i) {
				count++;

			}
		}
		System.out.println("水仙花有" + count + "个");
		System.out.println("------------------------------------------------");
		// whilt版本
		int count1 = 0;
		int i = 100;
		while (i < 1000) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if (ge * ge * ge + bai * bai * bai + shi * shi * shi == i) {
				count1++;

			}
			i++;
		}

		System.out.println("水仙花有" + count1 + "个");
	}
}
