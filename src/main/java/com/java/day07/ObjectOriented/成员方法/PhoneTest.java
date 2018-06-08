package com.java.day07.ObjectOriented.成员方法;

/*
 标准的手机类练习

 手机类：
 成员变量：brand,price,color
 构造方法：无参构造
 成员方法：getXxx()/setXxx()
 */
//定义手机类
class Phone {
	// 品牌
	private String brand;
	// 价格
	private int price;
	// 颜色
	private String color;

	// 无参构造方法
	public Phone() {

	}

	// get和set方法
	public String getBrand() {
		return brand;

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		// 给成员变量赋值
		p.setBrand("全球最贵的手机");
		p.setColor("全球最好看的颜色");
		p.setPrice(999999999);
		// 获取值
		System.out.println(p.getBrand() + "," + p.getColor() + ","
				+ p.getPrice() + "$");
	}
}
