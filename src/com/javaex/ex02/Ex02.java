package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[]srgs) {
		
		Scanner sc = new Scanner(System.in); // 먼저 설정해 줌
		
		//안내출력
		System.out.println("이름을 입력해주세요");
		//이름출력
		System.out.print("이름:");
		//이름 입력받기
		String name = sc.nextLine();
		//결과 출력
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		String age = sc.nextLine();
		System.out.println("당신의 이름은 " + name + "나이는" + age + " 입니다.");
		
		
		sc.close();
		
		
		
		
		
	}

}
