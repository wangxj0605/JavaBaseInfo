package com.java.day08.继承.帮助文档的制作和使用.版本2;

/*
 我想要对数组进行操作

 如何制作一个说明书呢?
 A:写一个工具类
 B:对这个类加入文档注释
 怎么加呢?
 加些什么东西呢?
 C:用工具解析文档注释
 javadoc工具
 D:格式
 javadoc -d 目录 -author -version ArrayTool.java

 目录：就可以写一个文件夹的路径

 制作帮助文档出错：
 找不到可以文档化的公共或受保护的类：告诉我们类的权限不够
 */
class ArrayDemo {
	public static void main(String[] args) {

		int[] arr = { 28, 55, 37, 46, 19 };
		// 遍历
		ArrayTool.prinArray(arr);
		// 获取最大值
		int max = ArrayTool.getMax(arr);
		System.out.println("最大值是:" + max);

		// 获取最小值
		int min = ArrayTool.getMin(arr);
		System.out.println("最小值是:" + min);

		// 获取索引
		int index = ArrayTool.getIndex(arr, 19);
		System.out.println(index);
	}
}
