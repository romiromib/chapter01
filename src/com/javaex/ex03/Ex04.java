package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("근무시간:");
		int time = sc.nextInt();
		
		if(time<=8) {
			System.out.println("임금은 "+ time*10000 +"원 입니다.");
		}
		else {
			int OT= 80000+(time-8)*12000;
			System.out.println("임금은 "+ OT +"원 입니다.");
		}
		
		*/
			System.out.print("근무시간:");
			int time = sc.nextInt();
			
			int salary; //<=미리 선언해 주면 if문에서 이용해서 쓸 수 있다.
			
			if(time<=8) {
				salary = time*10000;
			}
			else {
				salary = 80000+(time-8)*12000;
			}
			
			System.out.println("임금은 "+ salary +"원 입니다.");
			
		 
		
		
		sc.close();
		

	}

}
