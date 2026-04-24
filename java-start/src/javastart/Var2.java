package javastart;

public class Var2 {
	public static void main(String[] args) {
		final double PI =3.14;
		double res = PI * 10;
		res = PI * 10;
		System.out.println(res);
		//var: 자동으로 변수의 타입(형) 결정, 초기값을 보고 판단
		var x = 5;
		System.out.println(x++ + ++x);
		//왼쪽x: 5-> ++해서 6 -> ++헤사 7 따라서 5+7 = 12
		System.out.println(1500*2+300+"hello");
		var k = 30.5;
		var y = 12.3f;
		String m = "java";
		System.out.println(k+""+y+""+m);
	}
}
