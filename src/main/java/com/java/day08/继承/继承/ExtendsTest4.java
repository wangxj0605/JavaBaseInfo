package com.java.day08.继承.继承;

/*
 猫狗案例讲解

 先找到具体的事物，然后发现具体的事物有共性，才提取出一个父类。

 猫：
 成员变量：姓名，年龄，颜色
 构造方法：无参，带参
 成员方法：
 getXxx()/setXxx()
 eat()
 palyGame()
 狗：
 成员变量：姓名，年龄，颜色
 构造方法：无参，带参
 成员方法：
 getXxx()/setXxx()
 eat()
 lookDoor()

 共性：
 成员变量：姓名，年龄，颜色
 构造方法：无参，带参
 成员方法：
 getXxx()/setXxx()
 eat()

 把共性定义到一个类中，这个类的名字叫：动物。
 动物类：
 成员变量：姓名，年龄，颜色
 构造方法：无参，带参
 成员方法：
 getXxx()/setXxx()
 eat()

 猫：	
 构造方法：无参，带参
 成员方法：palyGame()
 狗：
 构造方法：无参，带参
 成员方法：lookDoor()
 */
class Animal {
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 颜色
	private String color;

	// 无参构造方法
	public Animal() {

	}

	// 带参构造方法
	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("准备吃饭了");
	}
}

class Cat extends Animal {
	// 无参构造
	public Cat() {

	}

	// 带参构造
	public Cat(String name, int age, String color) {
		super(name, age, color);
	}

	public void playGame() {
		System.out.println("猫玩英雄联盟");
	}

}

class Dog extends Animal {
	public Dog() {

	}

	public Dog(String name, int age, String color) {
		super(name, age, color);
	}

	public void loolDoor() {
		System.out.println("狗会看门");
	}
}

public class ExtendsTest4 {
	public static void main(String[] args) {
		Cat C = new Cat();
		C.setName("Hello kelly");
		C.setColor("白色");
		C.setAge(3);
		System.out.println("名字叫做" + C.getName() + "的" + C.getColor() + "的猫,今年"
				+ C.getAge() + "了");
		System.out.println("--------------------------------");
		// 方式2
		Cat c = new Cat("胡小芬", 27, "白色的");
		System.out.println("名字叫做" + c.getName() + "的" + c.getColor() + "的猫,今年"
				+ c.getAge() + "了");

	}
}
