package com.javaex.ex01;

public class Ex08 {
	public static void main (String[]args) {
	
		double v01 = 5/4; //정수와 정수를 계산하면 자료형이 정수로 결과가 나옴
		System.out.println(v01);
		
		double v02 = (double)5/4;//실수와 정수를 계산하면 자료형을 실수에 맞춘다
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
		int v99 = (int)(5/(double)4);
		System.out.println(v99);
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		
		//int v07 = (int)1.3+1.8;
		double v07 = (int)1.3+1.8;
		System.out.println(v07);
		
		
		
		
		
		
		
	}

}
