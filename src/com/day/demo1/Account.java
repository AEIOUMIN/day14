package com.day.demo1;

import java.util.Scanner;

public class Account {
	int money0 = 0;
	int money1 = 0;
	Scanner input = new Scanner(System.in);
	public void addAccount() {
		boolean con = true;
		while (con) {
			System.out.println();
			System.out.println("1,存款" + "\t" + "2,取款" + "\t" + "0,退出");
			System.out.print("请输入您需要办理的业务：");
			int num = input.nextInt();
			switch (num) {
			case 1:
				add();
				break;
			case 2:
				get();
				break;
			case 0:
				System.out.println("谢谢您的使用！");
				con = false;
				break;
			}

		}
	}
	public void add() {
		System.out.print("请输入您要存款的金额：");
		int money = input.nextInt();
		money0 = money + money0;
		System.out.println("存款成功");
		System.out.println("******当前余额为：" + money0 + "*******");
	}
	public void get() {
		System.out.print("请输入您的取款的金额：");
		int money1 = input.nextInt();
		if (money0 >= money1 && money0!=0) {
			System.out.println("取款成功！");
			System.out.println("******当前余额为：" + (money0 - money1) + "*******");
		}else{
			System.out.println("账户余额不足!");
			System.out.println("******当前余额为：" + money0 + "*******");
		}
	}
}
