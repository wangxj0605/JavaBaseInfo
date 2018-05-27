package com.java.day04.LectureStatement.While;

/*
 *while循环的基本格式：
 *	while(判断条件语句) {
 *		循环体语句;
 *	}
 *	
 *	扩展格式：
 *	
 *	初始化语句;
 *   while(判断条件语句) {
 *	 循环体语句;
 *	 控制条件语句;
 *	}
 *	
 *	通过这个格式，我们就可以看到其实和for循环是差不多的。
 *	
 *	for(初始化语句;判断条件语句;控制条件语句) {
 *		循环体语句;
 *	}
 */
public class WhileDemo {
	public static void main(String[] args) {
		// 输出10次hellworld
		// for循环版本
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWofld !");
		}
		System.out.println("-------------------------------------------------");
		// while版本的
		int i = 0;
		while (i < 10) {
			System.out.println("HelloWofld !");
			i++;
		}
	}
}
