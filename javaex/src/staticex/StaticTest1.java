package staticex;

class Counter {
	int cnt = 0; //일반 변수(인스턴스 변수)
	
	void increase() { 
		cnt++;
	}
}

public class StaticTest1 {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.increase(); //객체마다 각각의 기억 장소가 생성됨. (즉, 다른 객체와 변수 및 메서드를 공유하지 않음.)
		c2.increase();
		
		System.out.println("c1: " + c1.cnt); //c1: 1
		System.out.println("c2: " + c2.cnt); //c2: 1
	}
}