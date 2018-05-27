package com.java.day04.LectureStatement.Switch;

import java.util.Scanner;

/*
 **根据你键盘录入的字符串，判断是否有满足要求的，如果有就输出。
 *否则，提示有误。

 *String s = sc.nextLine();
 */
public class SwitchTest2 {
	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner scanner = new Scanner(System.in);

		// 录入数据
		System.out.println("请输入你要判断的字符串: ");
		String s = scanner.nextLine();

		switch (s) {
		case "hub":
			System.out.println("你输入的是 hub");

			break;
		case "wms":
			System.out.println("你输入的是 wms");

			break;
		case "pac":
			System.out.println("你输入的是pac");

			break;
		case "oms":
			System.out.println("你输入的是oms");
			break;
		default:
			System.out.println("你输入的不正确");
			break;
		}

	}
}
