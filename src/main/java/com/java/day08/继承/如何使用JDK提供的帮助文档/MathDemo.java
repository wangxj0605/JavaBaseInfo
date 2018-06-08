package com.java.day08.继承.如何使用JDK提供的帮助文档;

/*
 * Math:类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
 * 由于Math类在java.lang包下,所以不需要导包
 *   特点：
 *      没有构造方法，因为它的成员全部是静态的。
 *   掌握一个方法：
 *      获取随机数
 *      public static double random():返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
 * */
public class MathDemo {
	public static void main(String[] args) {
		// 获取随机数
		// double d = Math.random();
		// System.out.println(d);

		// 需求:获取一个1到100之间的随机数
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			System.out.println(num);
		}

	}
}
