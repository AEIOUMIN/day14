package com.day.demo2;

public class Avg {
	int[] arr = new int[50];
	int sum=0;
	int avg=0;
	int index=0;
	int max=0;
	public void add(int num){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[i]=num;
				sum=arr[i]+sum;
				index++;
				break;
			}
		}		
	}
	public void avg(){
		System.out.println(sum);
		avg=sum/index;
		System.out.println("平均值："+avg);
	}
	public void max(){
		
		for(int i=0;i<index;i++){
			if(arr[i+1]<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("最大值："+max);
	}
}
