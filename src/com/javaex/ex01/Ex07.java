package com.javaex.ex01;

public class Ex07 {
	public static void main(String []args){
		
		//자동 형변환
		int var00 = 3+5;
		System.out.println(var00);
		
		int a = 3;  //3.0으로 자동 형변환 됨(계산할 때에만 형변환되어 계산 됨)
		double b = 3.5;
		double var02 = a+b;
		System.out.println(var02);
		
		/////////////////////////////////////////////////
		//강제 형변환
		float var04 = 1111.6345f;
		int var05 = (int)var04;
		System.out.println(var04);
		System.out.println(var05);

		/////////////////////////////////////////////////
		//정수형안에서
		//축소 형변환(int-->byte)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02); //값이 변하지 않는다
		
		//축소 형변환(int-->byte)
		int v03 = 203029770;
		byte v04 = (byte)v03;
		System.out.println(v04);//값이 비정상->값이 변하는 이유 공부
		
		//확대 형변환(byte-->int)
		byte v05 = 127;
		int v06 = (int)v05;
		System.out.println(v06);//값이 그대로 나오는 이유 공부
		
		
		/////////////////////////////////////////////////
		//실수-->정수 형변환
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수-->실수 형변환
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	
		
		
		
		
		
		
		
		
	}

}
