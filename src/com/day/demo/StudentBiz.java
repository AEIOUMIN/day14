package com.day.demo;

import java.util.Scanner;

public class StudentBiz {
	String[] names = new String[30];
	Scanner input = new Scanner(System.in);
	public void  addName(String name){
		for(int i =0;i<names.length;i++){			
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void showName(){
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
	public boolean  searchName(int start,int end,String name){
		boolean find =false;
		for(int i=start-1;i<end;i++){
			if(names[i].equals(name)){				
				find=true;			
			}
		}
		return find;
	}
}
