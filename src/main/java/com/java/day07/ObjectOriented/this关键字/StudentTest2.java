package com.java.day07.ObjectOriented.this关键字;

/*
 标准的代码改进版

 this:哪个对象调用那个方法，this就代表那个对象
 */
public class StudentTest2 {
	public static void main(String[] args) {
		// 创建对象
		Student1 s = new Student1();
		s.setName("汪先锦");
		s.setAge(27);
		System.out.println(s.getAge() + "------" + s.getName());

		// 创建第二个对象
		Student1 s1 = new Student1();
		s1.setAge(2);
		s1.setName("汪禹轩");
		System.out.println(s1.getAge() + "------" + s1.getName());

	}
}

class Student1 {
	private String name;
	private int age;

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
