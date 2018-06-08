package com.java.day06.ArrayAndObject.Array2;

/*
 格式3：
 基本格式：
 数据类型[][] 数组名 = new 数据类型[][]{{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}};
 简化版格式：
 数据类型[][] 数组名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...}};

 举例：
 int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
 int[][] arr = {{1,2,3},{4,5},{6}};
 */
public class Array2Demo2 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		System.out.println(arr[0][0]); // 1
		System.out.println(arr[1][0]); // 4
		System.out.println(arr[2][0]); // 6

		System.out.println(arr[0][1]); // 2
		System.out.println(arr[1][1]); // 5
		// 越界
		// System.out.println(arr[2][1]); // 错误
	}
}