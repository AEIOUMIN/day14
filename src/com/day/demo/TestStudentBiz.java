package com.day.demo;

import java.util.Scanner;

public class TestStudentBiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentBiz st = new StudentBiz();
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入学生的姓名：");
			String name = input.next();
			st.addName(name);
		}
		st.showName();
		System.out.print("请输入查询的开始位置：");
		int s = input.nextInt();
		System.out.print("请输入查询的结束位置：");
		int e =input.nextInt();
		System.out.print("请输入学生的姓名：");
		String name = input.next();
		System.out.println("*************");
		if(st.searchName(s, e, name)){
			System.out.println("找到了");
		}else{
			System.out.println("没有找到该学生");
		}
	}
}
