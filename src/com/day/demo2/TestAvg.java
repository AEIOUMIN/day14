package com.day.demo2;

import java.util.Scanner;

public class TestAvg {
	public static void main(String[] args) {
		Avg avg = new Avg();
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入数字：");
			int num = input.nextInt();
			avg.add(num);			
		}
		avg.avg();
		avg.max();
	}
}
