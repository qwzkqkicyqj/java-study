package pack2;	

import pack1.Parent;

public class Child extends Parent{ //Parent에서 상속받음.
	public void printChild() { //설계도의 메서드는 
		System.out.println("=== 자식 클래스 접근 ===");
		System.out.println("public a = " + a);
		System.out.println("protected b = " + b);
//		System.out.println("default c = " + c); //default는 같은 패킷에서만 사용 가능하다.
												//(protected의 경우 상속받은 클래스는 다른 패킷이여도 사용 가능하지만 default는 상속을 받더라고 사용이 불가함.)
//		System.out.println("private d = " + d); //private의 경우 같은 클래스 내에서만 사용 가능함. (상속 불가)
	}
}
