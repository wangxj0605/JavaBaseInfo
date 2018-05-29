package com.java.day05.array.Array;

/*
 需求：数组元素查找(查找指定元素第一次在数组中出现的索引)

 分析：
 A:定义一个数组，并静态初始化。
 B:写一个功能实现
 遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
 如果相等，就返回当前的索引值。
 */
public class ArrayTest4 {
	public static void main(String[] args) {

		// 定义一个数组，并静态初始化
		int[] arr = { 200, 250, 38, 888, 444 };
		// 需求：我要查找250在这个数组中第一次出现的索引
		int index = getIndex(arr, 250);
		System.out.println("他在数组中的索引是:" + index);

		int index2 = getIndex2(arr, 888);
		System.out.println("他在数组中的索引是:" + index2);

	}

	public static int getIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}

		}
		return -1;

	}

	public static int getIndex2(int[] arr, int value) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index = i;
				break;
			}

		}
		return index;

	}
}
