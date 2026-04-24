package accessex;

class Sample {
	public int a;
	private int b;
	int c;
	
	protected void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a =10;
//		sample.b =10; //다른 클래스이기 때문에 접근이 불가능하다.
		sample.c =10;
		sample.show();
	}
}
	