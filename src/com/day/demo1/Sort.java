package com.day.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	String[] arr = new String[5];
	Scanner input = new Scanner(System.in);
	public void sort() {			
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入姓名：");
			String name =input.next();
			if(arr[i]==null){
				arr[i]=name;				
			}
		}
	}
	public void showSort(){
		System.out.println("* * * * * * * 排序前 * * * * * * *");
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				System.out.print(arr[i]+"\t");
			}
		}
	}
	public void sortSerial(){
		System.out.println("\n* * * * * * * 排序后 * * * * * * *");
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				Arrays.sort(arr);
				System.out.print(arr[i]+"\t");
			}
		}
	}
}
