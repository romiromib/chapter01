package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[]args) {
		
		int i = 12345;
		double d = 3.14;
		char c = '백';
		String s = "백";
		
		String str = "안녕하세요";
		String name = "새로미";
		String hello = "오하요";
		
		System.out.println(i);
		System.out.println(12345);
		
		System.out.println(str);
		System.out.println("안녕하세요");
		
		System.out.print(name);
		System.out.println(str);
		System.out.println("-------");
		
		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println("-------");
		
		System.out.println(hello + name);
		System.out.println(hello + name + hello);
		System.out.println(hello + " " + name + "님 " + hello);//띄어쓰기
		System.out.println(hello + " 제 이름은 " + name + " 입니다");
		
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(i+d);
		System.out.println(c+c); //캐릭터형은 +를 만나면 코드값으로 인식함 
		System.out.println(s+s); //문자열로 해결
		
		System.out.println(name+i); //문자열로 출력됨
		System.out.println(name+i+d); //문자열로 출력됨
		System.out.println("-------");
		
		System.out.println("안\"녕\"하세요");
		System.out.println("안녕\\하\\세요");
		System.out.println("안녕\n하세요");
		System.out.println("안\t녕\t하세요");
		
		
		
	}

}
