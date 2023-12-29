package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int [] num = new int[6];
		
		for(int i=0; i<num.length ;i++) {
			
			int no = (int)(Math.random()*45)+1;
			System.out.print(no+" ");
		}
		

	}

}
