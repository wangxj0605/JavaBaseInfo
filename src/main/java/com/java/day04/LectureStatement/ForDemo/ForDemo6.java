package com.java.day04.LectureStatement.ForDemo;

/*
 练习：
 *	请在控制台输出满足如下条件的五位数
 *	个位等于万位
 *	十位等于千位
 *	个位+十位+千位+万位=百位
 *	
 *分析：
 *	A:五位数就告诉了我们范围。
 *	B:分解每一个五位数的个，十，百，千，万位上的数据
 *	C:按照要求进行判断即可
 */
public class ForDemo6 {
	public static void main(String[] args) {
		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			int qian = i / 10 / 10 / 10 % 10;
			int wan = i / 10 / 10 / 10 / 10 % 10;

			// 分解每一个五位数的个，十，百，千，万位上的数据
			if ((ge == wan) && (shi == qian) && (ge + shi + qian + wan == bai)) {
				System.out.println(i);
			}
		}
	}
}
