package com.day.demo;

public class CustomerBiz {
	String[] names = new String[50];

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
}
