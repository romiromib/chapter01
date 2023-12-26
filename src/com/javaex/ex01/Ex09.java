package com.javaex.ex01;

public class Ex09 {
	public static void main(String[]args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		/*
		int var01 = a+b;
		System.out.println(var01);
		*/
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //나누기->몫
		System.out.println(a%b); //나누기->나머지
		
		
	System.out.println("-----%연산자 심화------");
		//%연산자 심화
		System.out.println(7/2);         //몫
		System.out.println((double)7/2); //몫(실수형)
		System.out.println(7.0/2);       //몫(실수형)
		System.out.println(7%2);         //나머지
		System.out.println(7.0%2);       //나머지(실수형)
		
		
		System.out.println("-----부호연산자------");
		
		int var = -3;
		int pVar = +var; // +(-3) => -3
		int mVar = -var; // -(-3) => +3
		System.out.println(pVar);
		System.out.println(mVar);
		
		
		
		
		
		
		
	}

}
