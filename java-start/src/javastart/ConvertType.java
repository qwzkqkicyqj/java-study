package javastart;

import java.util.Scanner; //Scanner클래스 사용
//import는 ctrl + shift + o
public class ConvertType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드로 입력하기 위해 		//import java.util.Scanner;
		//문자열 입력
		System.out.println("숫자를 문자로 입력하세요");
		String a=sc.nextLine(); //nextLine()는 문자열 한 줄 입력받음.
		sc.close();
		//문자열->숫자 변환
		double num = Double.parseDouble(a); //a(문장) -> num(정수)
		//Integer(정수): Wrapper class(래퍼클래스)
		//기본형을 객체로 감싸는 클래스
		//Integer.parseInt(a) 문장형을 정수형으로 변환
		//숫자 -> 문자열
		String s1 = Double.toString(num); //문장형으로 변환 //toString앞에 타입 지정
		String s2 = String.valueOf(num); //문장형으로 변환 //s2의 타입 관계 x
		
		//출력
		System.out.println("입력 문자열: "+a);
		System.out.println("숫자로 변환: "+num);
		System.out.println("다시 문자열로 변환(toString): "+s1);
		System.out.println("다시 문자열로 변환(valueOf): "+s2);
		
	}	
}
