package com.java.day04.LectureStatement.DoWhile;

/*
 *循环语句的区别:
 *	do...while循环至少执行一次循环体。
 *	而for,while循环必须先判断条件是否成立，然后决定是否执行循环体语句。
 *	
 *那么，我们一般使用哪种循环呢?
 *	优先考虑for，其次考虑while，最后考虑do...while
 */
public class DoWhileDemo1 {
	public static void main(String[] args) {
		int i = 3;
		while (i < 3) {
			System.out.println("我爱学JAVA");
			i++;

		}
		System.out.println("----------------------------");

		int a = 3;
		do {
			System.out.println("我爱学JAVA");
			a++;
		} while (a < 3);
	}
}
