package javastart;

public class Arithmetic2 {

	public static void main(String[] args) {
		int i = 20;
		double j =10.5;
		int res1;
		double res2;
		res1 = sum(i, 10);
		res2 = sum(i, j);
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
}

//메서드 오버 로딩
// -> 같은 이름의 메서드 생성
// -> 매개변수의 타입과 개수과 다름
// -> 반환 타입은 관계없음

//sum(int a, int b)
//sum(int a, int b, int c) -> 가능
//
//sum(int a, int b)
//sum(double a, double b) -> 가능
//
//sum(int a, double b)
//sum(double a, int b) -> 가능
//
//int sum(int a, int b)
//double sum(int x, int y) -> 오류