package com.java.day08.继承.继承;

/*
 类的组成：
 成员变量：
 构造方法：
 成员方法：
 而现在我们又讲解了继承，所以，我们就应该来考虑一下，类的组成部分的各自关系。

 继承中成员变量的关系:
 A:子类中的成员变量和父类中的成员变量名称不一样，这个太简单。
 B:子类中的成员变量和父类中的成员变量名称一样，这个怎么玩呢?
 在子类方法中访问一个变量的查找顺序：
 a:在子类方法的局部范围找，有就使用
 b:在子类的成员范围找，有就使用
 c:在父类的成员范围找，有就使用
 d:如果还找不到，就报错。
 */
class Father3 {
	int num = 10;

	public void method() {
		int num = 50;
	}
}

class Son3 extends Father3 {
	public int num = 20;
	public int num1 = 150;

	public void show() {
		int num = 40;
		System.out.println(num);
		System.out.println(num1);

	}
}

public class ExtendsDemo3 {

	public static void main(String[] args) {

		Son3 s = new Son3();

		s.show();
	}

}
