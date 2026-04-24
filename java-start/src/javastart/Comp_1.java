package javastart;

public class Comp_1 {
	public static void main(String[] args) {
		String str1 = "문자열1";
		String str2 = "문자열1";
		boolean res1 = str1.equals(str2);
		boolean res2 = "hello"=="hello2";
		//문자열 같다는 .equals를 사용한다.
		
		System.out.println(res1);
		System.out.println(res2);
		
		System.out.println(true & true);
		System.out.println(false & true);
		System.out.println(false | true);
		
		//10보다 크고 20보다 작다.
		int k = 15;
		boolean res3 = k > 10 & k<20;
		System.out.println(res3);
	}
}
