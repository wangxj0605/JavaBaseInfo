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

 看上面两个类的成员，发现了很多相同的东西，所以我们就考虑抽取一个共性的类：
 人：
 成员变量；姓名，年龄
 构造方法：无参，带参
 成员方法：getXxx()/setXxx()

 学生 继承 人
 老师 继承 人
 */
//定义人类
class Person1 {
	// 姓名
	private String name;
	// 年龄
	private int age;

	public Person1() {
	}

	public Person1(String name, int age) { // "林青霞",27
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

// 定义学生类
class Student3 extends Person1 {
	public Student3() {
	}

	public Student3(String name, int age) { // "林青霞",27
		// this.name = name;
		// this.age = age;
		super(name, age);
	}
}

// 定义老师类
class Teacher3 extends Person1 {

}

class ExtendsTest3 {
	public static void main(String[] args) {
		// 创建学生对象并测试
		// 方式1
		Student3 s1 = new Student3();
		s1.setName("林青霞");
		s1.setAge(27);
		System.out.println(s1.getName() + "---" + s1.getAge());

		// 方式2
		Student3 s2 = new Student3("林青霞", 27);
		System.out.println(s2.getName() + "---" + s2.getAge());

		// 补齐老师类中的代码并进行测试。
	}
}