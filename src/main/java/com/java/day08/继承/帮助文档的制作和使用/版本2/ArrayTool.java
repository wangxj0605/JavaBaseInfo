package com.java.day08.继承.帮助文档的制作和使用.版本2;

/**
 * 这是针对数组操作的工具类
 * 
 * @author WSH10112
 * @version v1.0
 * */
public class ArrayTool {
	/**
	 * 这是私有构造方法
	 */
	private ArrayTool() {

	}

	/**
	 * 这是遍历数组的方法,遍历后的的格式是:[元素1, 元素2, 元素3, ....]
	 * 
	 * @param int[] arr 这是要被遍历的数组
	 */
	public static void prinArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}

		}

	}

	/**
	 * 这是获取数组中最大值的方法
	 * 
	 * @param int[] arr 这是要获取最大值的数组
	 * @return int 返回数组中的最大值
	 */

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;

	}

	/**
	 * 获取指定元素第一次在数组中第一次出现的索引如果元素不存在就返回-1
	 * 
	 * @param int[] arr 被查找的数组
	 * @param int value 要查找的元素
	 * @return int 返回元素在数组中的索引,如果不存在 返回 -1
	 */
	public static int getIndex(int[] arr, int value) {
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