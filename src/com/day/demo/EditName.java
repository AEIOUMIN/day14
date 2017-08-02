package com.day.demo;

import java.util.Scanner;

public class EditName {
	String[] names = new String[50];
	Scanner input = new Scanner(System.in);
	public void addName(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i] =name;
				break;
			}
		}
	}
	public void showName(){
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println("\t客户姓名列表：");
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println("\n");
	}
	public  boolean  editName(String oldName,String newName){
		boolean ed =false;		
		for(int i=0;i<names.length;i++){
			if(names[i]!=null&&names[i].equals(oldName)){
				names[i]=newName;
				ed =true;
				break;				
			}
		}
		System.out.println("\n*****修改结果******");		
		return ed;
	}
	public void  startName(int num){
		
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入客户姓名： ");
			String name = input.next();
			addName(name);			
		}
	}
	public void boName(){
		boolean con;
		do{
			con=false;
			System.out.print("请输入要修改的客户姓名：");
			String oldName= input.next();
			System.out.print("请输入新的客户姓名：");
			String newName= input.next();
			if(editName(oldName, newName)){
				System.out.println("找到并修改成功！");
				showName();
			}else{
				System.out.println("没有找到该客户!");
			}
		}while(con==true);
	}
}
