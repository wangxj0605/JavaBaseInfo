package com.java.day05.array.Array;

import java.util.Scanner;

/*
 数组查表法(根据键盘录入索引,查找对应星期)
 意思是：String[] strArray = {"星期一","星期二",...};
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		// 定义数组
		String[] arr = { "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };

		// 创建键盘录入
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入索引");
		int index = scanner.nextInt();
		System.out.println("你输入的日期是: " + arr[index]);

	}
}
