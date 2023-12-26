package com.javaex.ex01;

public class Ex10 {
	
	public static void main (String[]srgs) {
		
		//증감 연산자(변수 앞에 붙을 때)
		
		int a = 7;
		
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);  //원본인 a가 바뀌었는지 확인		
		/*
		int a;
		a = 7;
		
		System.out.println(a);
		System.out.println(++a); => 할 일이 두가지 있다
									1.출력하는일
									2.숫자하나 올리는일
									연산자가 변수 앞에 붙으면 연산자를 가장 먼저 수행
		System.out.println(a); => a가 바뀌었는지 확인
		*/
		
		System.out.println(a);
		System.out.println(--a); //--가 변수 앞에 있으므로 우선순위 높다
		System.out.println(a);
		
	
		
		
	}

}
