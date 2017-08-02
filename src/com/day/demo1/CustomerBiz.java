package com.day.demo1;

public class CustomerBiz {

	Customer[] names = new Customer[50];
 
	public void addName(Customer cu) {
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				names[i]=cu;
				break;
			}
		}
	}
	public void showName(){
		System.out.println("客户信息:");
		System.out.println("姓名" + "\t" + "年龄" + "\t" + "是否会员");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				
				names[i].custInfo();
			}
		}
	}
}
