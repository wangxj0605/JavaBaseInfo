package com.java.day06.ArrayAndObject.Object;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "苹果";
		p.color = "白色";
		p.price = 10086;
		System.out.println(p.brand + " ," + p.color + ", " + p.price + "元");

		p.call("汪先锦");
		p.sendMessage();
		p.playGame();
	}
}
