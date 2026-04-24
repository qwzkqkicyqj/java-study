package pack1;

public class ParentTest {
	public static void main(String[] args) {
		Parent p = new Parent();
	
	System.out.println("=== 같은 패키지 테스트 ===");
	System.out.println("public a = " + p.a);
	System.out.println("protected b = " + p.b);
	System.out.println("default c = " + p.c);
	//System.out.println("private d = " + p.d); //private는 동일 클래스 내에서만 접근 가능
	
	System.out.println("\n=== 메서드 호출 ===");
	p.show();
}
}