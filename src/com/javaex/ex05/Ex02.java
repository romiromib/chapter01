package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		int no1;
		int no2;
		int no3;
		int no4;
		int no5;
		int no6;
		
		/*
		for(int i=1; i<=6; i++) {
		 
			no = (int)(math.random()*45)+1;
		} => 변수는 지정해줘야함.
				*/
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		
		System.out.print(no1+"  ");
		System.out.print(no2+"  ");
		System.out.print(no3+"  ");
		System.out.print(no4+"  ");
		System.out.print(no5+"  ");
		System.out.print(no6);
		
	}

}
