package com.java.day08.继承.继承;

/*
 *如果父类没有无参构造方法，那么子类的构造方法会出现什么现象呢?
 *	*报错。
 *如何解决呢?	
 *	*A:在父类中加一个无参构造方法
 *	*B:通过使用super关键字去显示的调用父类的带参构造方法
 *	*C:子类通过this去调用本类的其他构造方法
 *		*子类中一定要有一个去访问了父类的构造方法，否则父类数据就没有初始化。

 *注意事项：
 *	*this(...)或者super(...)必须出现在第一条语句上。
 *	*如果不是放在第一条语句上，就可能对父类的数据进行了多次初始化，所以必须放在第一条语句上。
 */
class Father6 {
	/*
	 * public Father() { System.out.println("Father的无参构造方法"); }
	 */

	public Father6(String name) {
		System.out.println("Father的带参构造方法");
	}
}

class Son6 extends Father6 {
	public Son6() {
		super("随便给");
		System.out.println("Son的无参构造方法");
		// super("随便给");
	}

	public Son6(String name) {
		// super("随便给");
		this();
		System.out.println("Son的带参构造方法");
	}
}

class ExtendsDemo6 {
	public static void main(String[] args) {
		Son6 s = new Son6();
		System.out.println("----------------");
		Son6 ss = new Son6("林青霞");
	}
}