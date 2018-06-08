package com.java.day09.多态抽象类.final关键字;

/*
 继承的代码体现

 由于继承中方法有一个现象：方法重写。
 所以，父类的功能，就会被子类给覆盖调。
 有些时候，我们不想让子类去覆盖掉父类的功能，只能让他使用。
 这个时候，针对这种情况，Java就提供了一个关键字：final

 final:最终的意思。常见的是它可以修饰类，方法，变量。
 */
class Fu {
	public void show() {
		System.out.println("这个你就不能动");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("这个我就要动动");
	}
}

public class ZiDemo {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.show();
	}
}
