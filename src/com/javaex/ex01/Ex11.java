package com.javaex.ex01;

public class Ex11 {
	
	public static void main(String[]srgs) {
		
		//증감연산자
		 
		int b = 10;
		
		System.out.println(b);
		
		System.out.println(b);
		System.out.println(b++); //=> 할 일이 두가지 있다
								 //1.출력하는일
								 //2.숫자하나 올리는일
								 //연산자가 변수 뒤에 붙으면 연산자를 나중에 수행
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		
		System.out.println("------심화-------");
		
		int no = 10;
		System.out.println(++no + 3);//1.출력(3) 2.++(1) 3.+3(2)
		System.out.println(no);
		System.out.println(no-- + 3);//1.출력 2.-- 3.+3
		System.out.println(no);//->10
		
		++no;
		++no;
		System.out.println(no);//->12
		
		no++;
		++no;
		System.out.println(no);//->14
		
		
		
		
	}

}
