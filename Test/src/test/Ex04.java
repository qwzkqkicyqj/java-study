package test;

class Car{ //설계도 Class
	
	//멤버변수(필드) -> 속성
	String model; //String은 클래스임 (첫 글자 대문자)
	int speed;
	
	Car(String model, int speed) { //생성자(만약 없을 경우 기본 생성자가 호출됨)
		this.model = model;
		this.speed = speed;
	}	
	
	//메서드 -> 기능, 행위
	void print() {
		System.out.println("모델명: "+model+" / 속도: "+speed);
	}
}


public class Ex04 {
	public static void main(String[] args) {
		//객체 생성(생성자 호출)
		Car c1 = new Car("Sonata",100); 
		Car c2 = new Car("Avante", 120);
		
		//메서드 호출
		c1.print(); //c1, c2: 참조변수
		c2.print();
		//c1.model: Car클래스의 멤버 변수를 불러옴
	}
}
