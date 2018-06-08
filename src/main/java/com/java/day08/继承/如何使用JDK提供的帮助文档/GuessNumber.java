package com.java.day08.继承.如何使用JDK提供的帮助文档;

import java.util.Scanner;

/*
 *
 *猜数字小游戏(数据在1-100之间)
 *
 *分析：
 *	A:程序产生一个随机数。(被猜的)
 *	B:键盘录入数据。(你猜的)
 *	C:把你猜的和被猜的进行比较
 *		a:大了
 *		b:小了
 *		c:猜中了
 *	D:给出多次猜的机会，猜中就结束。
 *		while()循环，猜中就break
 * */
public class GuessNumber {
	public static void main(String[] args) {
		// 程序创建一个随机数(被猜的)
		int number = (int) (Math.random() * 100) + 1;
		// System.out.println(number);

		while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你要猜的数据(1-100)");
			int guessNumber = scanner.nextInt();
			// 把你猜的数和被猜的数做对比
			if (guessNumber > number) {
				System.out.println("你猜的数据" + guessNumber + "大了");
			} else if (number > guessNumber) {
				System.out.println("你猜的数据" + guessNumber + "小了");

			} else {
				System.out.println("恭喜你猜对了");
				break;
			}
		}
	}
}
