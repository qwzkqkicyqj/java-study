package exceptionex;

public class Exception02 {
	public static void main(String[] args) {
		int a=10;
		int b=0;

		try {
			System.out.println("연산을 합니다.");
			int result = a/b;
			System.out.println("result: "+result);
		} catch(ArithmeticException e) { //객체 변수e
			System.out.println("0으로 나눌 수 없습니다.(산술 오류)");
			System.out.println("오류 메시지: "+e.getMessage()); //에러의 원인 메시지ㅋ
		}
		System.out.println("프로그램 종료");
	}
}
