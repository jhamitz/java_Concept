package com.java.exceotionHandling;

public class Practice {
	
	
	public static int divide(int a, int b)  {
		
		if(a==b) {
			return 1;
		}else if(a*2==b) {
			return 2;
		}
		return a/b;
	}
	

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
	System.out.println(divide(a,b));
	
//	int []arr= {2,4,6,7,8,9};
//	for(int i=0;i<=arr.length;i++) {
//		System.out.println(arr[i]);
	}		
	}


