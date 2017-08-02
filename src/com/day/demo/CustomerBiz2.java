package com.day.demo;

import java.util.Scanner;

public class CustomerBiz2 {
	String[] names = new String[50];
	Scanner  input  = new Scanner(System.in);
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void showNames(){
		System.out.println("* * * * * * * * * * * * * *");
		System.out.println("\t客户姓名列表:");
		System.out.println("* * * * * * * * * * * * * *");
		for(int i=0;i<names.length;i++){
			 if(names[i]!=null){
				 System.out.print(names[i]+"\t");
			 }
		}
	}
	public void mainName(){
		boolean con =true;
		while(con){
			System.out.print("请输入客户的姓名：");
			String  name =input.next();
			addName(name);
			System.out.print("继续输入吗（y/n）？：");
			String choice =input.next();
			if(choice.equals("n")){
				con = false;
			}
		}
	}
		
	}


