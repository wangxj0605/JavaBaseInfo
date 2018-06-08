package com.java.day08.继承.继承;

/*
 学生案例和老师案例讲解

 学生：
 成员变量；姓名，年龄
 构造方法：无参，带参
 成员方法：getXxx()/setXxx()
 老师：
 成员变量；姓名，年龄
 构造方法：无参，带参
 成员方法：getXxx()/setXxx()
 */
//定义学生类
class Student1 {
	// 姓名
	private String name;
	// 年龄
	private int age;

	// 无参构造方法
	public Student1() {

	}

	// 带参构造方法
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getXxx()
	public String getName() {
		return name;

	}

	// setXxx
	public void setName(String name) {
		this.name = name;
	}

	// getXxx()
	public int getAge() {
		return age;

	}

	// setXxx
	public void setAge(int age) {
		this.age = age;
	}

}

class teacher1 {
	// 姓名
	private String name;
	// 年龄
	private int age;

	// 无参构造方法
	public teacher1() {

	}

	// 带参构造方法
	public teacher1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getXxx()
	public String getName() {
		return name;

	}

	// setXxx
	public void setName(String name) {
		this.name = name;
	}

	// getXxx()
	public int getAge() {
		return age;

	}

	// setXxx
	public void setAge(int age) {
		this.age = age;
	}

}

public class ExtendsTest2 {
	public static void main(String[] args) {
		// 创建对象
		// 测试方式1
		Student1 s = new Student1();
		s.setAge(28);
		s.setName("汪先锦");
		System.out.println("姓名:" + s.getName() + ",年龄" + s.getAge());

		System.out.println("----------------------");
		// 方式2
		Student1 s1 = new Student1("汪禹轩", 2);
		System.out.println("姓名:" + s1.getName() + ",年龄" + s1.getAge());

	}
}
