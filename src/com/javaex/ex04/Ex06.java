package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		int sum = 0 ;
		//int max =100;
		for(int i=1; i<=10; i++) {
		// (int i=1; i<=max; i++)
			sum = sum+i;
			System.out.println( i +"까지의 합은"+ sum );
			
		}

		System.out.println("1부터 10까지의 정수의 합은 "+ sum +" 입니다.");
		//System.out.println("1부터 max까지의 정수의 합은 "+ sum +" 입니다.");
	}

	
	
}
