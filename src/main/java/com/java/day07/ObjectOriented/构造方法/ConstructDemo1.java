package com.java.day07.ObjectOriented.构造方法;

/*
 * 我们一值在使用构造方法,但是我们都没有定义构造方法,用的是哪里来的呢?
 * 构造方法的注意事项
 *  A:如果我们没有给出构造方法,系统将自动提供一个无参构造方法
 *  B:如果我们给出了构造方法,系统将不在提供默认的无参构造方法
 *    注意:这个时候 ,如果我们还想使用无参构造方法,就必须自己给出,建议永远自己给出无参构造方法
 *    
 * 给成员变量赋值有两种方式:
 *   A:setXxx()
 *   B:构造方法
 *   */
class student1 {
	private String name;
	private int age;

	public student1() {
		System.out.println("这个是无参构造方法");
	}

	// 构造方法的重载格式

	public student1(String name) {
		System.out.println("这是一个string类型的构造方法");
		this.name = name;
	}

	public student1(int age) {
		System.out.println("这是一个int类型的构造方法");
		this.age = age;

	}

	public student1(String name, int age) {
		System.out.println("这是一个带多个参数的构造方法");
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println(name + "," + age);
	}

}

public class ConstructDemo1 {
	public static void main(String[] args) {
		// 创建对象
		student1 s = new student1();
		s.show();
		System.out.println("-------------");

		// 创建第二个对象
		student1 s1 = new student1("汪先锦");
		s1.show();
		System.out.println("-------------");

		// 创建第三个对象
		student1 s2 = new student1(28);
		s2.show();
		System.out.println("-------------");

		// 创建第四个对象
		student1 s3 = new student1("汪先锦", 28);
		s3.show();
		System.out.println("-------------");
	}
}