package pack1;

public class Parent {
	//System.out.println("=== 같은 패키지 테스트 ==="); //메서드 밖에 있다.
	public int a = 10;
	protected int b = 20;
	int c = 30; //default
	private int d = 40;
	
	public void show() {
		System.out.println("Parent메서드 실행");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d); //같은 클래스
		//d 변수는같은 클래스이기에 가능함.
	}
}