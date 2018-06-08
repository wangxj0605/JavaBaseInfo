package com.java.day08.继承.继承;

class Fu1 {
	static {
		System.out.println("静态代码块Fu");
	}

	{
		System.out.println("构造代码块Fu");
	}

	public Fu1() {
		System.out.println("构造方法Fu");
	}
}

class Zi1 extends Fu1 {
	static {
		System.out.println("静态代码块Zi");
	}

	{
		System.out.println("构造代码块Zi");
	}

	public Zi1() {
		System.out.println("构造方法Zi");
	}
}

public class ExtendsTest1 {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
	}
}
