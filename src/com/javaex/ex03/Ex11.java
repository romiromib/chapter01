package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		int days;		
		
		switch(month) {
		case 4,6,9,11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
			
		default:
			days = 31;
			break;
			
		}
		
		System.out.print(days+"일 입니다");
		
		/*
		if(month<=7) {
			if (month==2) {
				System.out.print("28 일 입니다");
			}
			else if(month%2==0) {
				System.out.print("30일 입니다");
			}
			else if(month%2!=0) {
				System.out.print("31일 입니다");
			}
			
		}
		else if(month%2==0) {
			System.out.print("31일 입니다");
		}
		else {
			System.out.print("30일 입니다");
		}
		*/
		
		sc.close();
		

	}

}
