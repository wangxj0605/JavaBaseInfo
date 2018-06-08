package com.java.day07.ObjectOriented.this关键字;

/*
 作业：请把手机类写成一个标准类，然后创建对象测试功能。

 手机类：
 成员变量：
 品牌：String brand;
 价格：int price;
 颜色：String color;
 成员方法：
 针对每一个成员变量给出对应的getXxx()/setXxx()方法。
 最后定义测试：
 创建一个对象，先通过getXxx()方法输出成员变量的值。这一次的结果是：null---0---null
 然后通过setXxx()方法给成员变量赋值。再次输出结果。这一次的结果是：三星---2999---土豪金
 */
public class PhoneTest {

	public static void main(String[] args) {

		// 创建对象
		Phone p = new Phone();

		System.out.println(p.getBrand() + "--" + p.getPrice() + "--"
				+ p.getColor());
		// 给成员变量赋值
		p.setBrand("iPhone");
		p.setColor("土豪金");
		p.setPrice(8888);
		System.out.println(p.getBrand() + "--" + p.getPrice() + "--"
				+ p.getColor());
	}
}

class Phone {
	private String brand;
	private int price;
	private String color;

	// 获取值
	public String getBrand() {
		return brand;

	}

	public int getPrice() {
		return price;

	}

	public String getColor() {
		return color;

	}

	// 赋值
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}
}