package staticex;
//static은 클래스가 메모리에 로딩될 때 생성됨
//모든 객체가 공유
//객체 없이 사용 가능(클래스 이름으로 접근)
//한 번만 생성됨(끝까지)

//static을 활용하여 객체 생성 없이 사용
class Counter2 {
	static int cnt = 0; //static을 활용하여 변수의 값을 공유 및 객체 없이 사용한다.
	
	static void increase() { //static를 활용하여 객체를 생성하지 않고 메서드를 호출한다.
		cnt++;
	}
}

public class StaticTest2 {
	public static void main(String[] args) {

		
		
		Counter2.increase(); //static 변수의 값이 공유됨
		Counter2.increase();
		
		System.out.println("count: " + Counter2.cnt); //2 출력
	}
}
