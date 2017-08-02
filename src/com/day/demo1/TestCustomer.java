package com.day.demo1;

public class TestCustomer {
	public static void main(String[] args) {
		Customer cu1 = new Customer();
		cu1.name = "张三";
		cu1.age = 20;
		cu1.isMember = true;
		Customer cu2 = new Customer();
		cu2.name = "李四";
		cu2.age = 20;
		cu2.isMember = true;
		CustomerBiz cb = new CustomerBiz();
		cb.addName(cu1);
		cb.addName(cu2);		
		cb.showName();
	}
}
