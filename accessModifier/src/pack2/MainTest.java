package pack2;
import pack1.Parent; //public클래스는 어느 곳에서나 객체 생성이 가능하다. 하지만, 다른 패키지일 경우 import를 통해 해당 클래스가 위치하고 있는 패킷을 불러와야 한다.

public class MainTest {
	public static void main(String[] args) {
		Parent pa = new Parent();
		Child ch = new Child();
		
		System.out.println("=== 일반 객체 접근 ===");
		System.out.println("public a = " + pa.a); //패킷 상관 없이 사용 가능
//		System.out.println("protected b = " + pa.b); //다른 패킷이고, 상속받지 않았기 때문에
//		System.out.println("default c = " + pa.c); //다른 패킷이기 때문에
//		System.out.println("private d = " + pa.d); //선언된 클래스에서만 사용 가능
		
		//자식 클래스 접근
		ch.printChild();
	}
}
