package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[]args){
		
		char ch01 = 'A';
		char ch02 = '백';
		//글자를 입력하려면 ''작은따옴표를 써줘야 함
		//두글자도 안됨
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		char ch03 = 65; //정수를 넣으면 코드값으로 인식 함
		System.out.println(ch03);
		
		char ch04 = '3'; //
		System.out.println(ch04);
		
		char ch05 = '빽'; //쌍따옴표는 사용안됨
		System.out.println(ch05);
		
		/////////////////////////////////////////
		//String 사용법만 익히자
		
		String name = "백새로미"; //반드시 쌍따옴표사용 1글자 이상
		System.out.println(name);
		
		//String name2 = '백';
		
	}

}
