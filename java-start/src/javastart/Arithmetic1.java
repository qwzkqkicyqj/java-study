package javastart;

public class Arithmetic1 {
	//main메서드
	public static void main(String[] args) {
		int x =20;
		int y =10;
		int res1, res2;
		res1 = add(x,y);
		res1 = sub(x,y);
		System.out.println(res1);
		System.out.println(res1);
	}
	//add 메서드
	public static int add(int a, int b) {
		return a + b;  //반환
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}
