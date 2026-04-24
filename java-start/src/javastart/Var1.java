package javastart;

public class Var1 {
	public static void main(String[] args) { //args: 인수
		int a = 100; //정수(4byte)
		long l = 100000000000l; //실수(8byte), L을 값에 붙임
		float f = 10.5f; //실수 (4byte), f를 값에 붙임
 		double b = 10.5; //실수 (8byte)
 		boolean c = true;
 		//불리언(boolean) true, flase (소문자) 입력 가능, 1파이트
 		char d = 'a'; //문자 하나가 2바이트
 		String e = "Hello Java";
 		//문자열, 문자열을 다루기 위한 특별한 타입 *대문자 S
 		
 		System.out.println(a);
 		System.out.println(l);
 		System.out.println(f);
 		System.out.println(b);
 		System.out.println(c);
 		System.out.println(d);
 		System.out.println(e);
 		System.out.println(a+"\n"+l+"\n"+f+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
 		System.out.printf("%d %d %.1f %.1f %b %c %s", a, l, f, b, c, d, e);
	}
}