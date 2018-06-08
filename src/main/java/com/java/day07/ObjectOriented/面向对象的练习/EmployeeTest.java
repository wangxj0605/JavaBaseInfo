package com.java.day07.ObjectOriented.面向对象的练习;

/*
 需求：
 定义一个员工类,自己分析出几个成员，
 然后给出成员变量，构造方法，getXxx()/setXxx()方法，
 以及一个显示所有成员信息的方法。并测试。

 分析：
 员工
 成员变量：
 员工编号，姓名，年龄
 构造方法：
 无参构造方法
 成员方法：
 getXxx()/setXxx()
 show();
 */
class Employee {
	// 工号
	private String employeeID;
	// 名字
	private String name;
	// 年龄
	private int age;

	// 构造方法
	public Employee() {

	}

	// get和set
	public String getEmployeeID() {
		return employeeID;

	}

	public void setEmplopeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;

	}

	public void setNname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("员工编号是：" + employeeID + "的这个人是：" + name + "的年龄是："
				+ age);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee ep = new Employee();
		// 赋值
		ep.setAge(28);
		ep.setEmplopeeID("JMSH10112");
		ep.setNname("汪先锦");
		// System.out.println("工号是:" + ep.getEmployeeID() + "," + "名字是:"
		// + ep.getName() + "," + "年龄是:" + ep.getAge());
		ep.show();

	}
}
