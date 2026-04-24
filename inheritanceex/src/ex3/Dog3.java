package ex3;
//자식클래스
public class Dog3 extends Animal3 {
	String breed; //멤버 변수
	
	Dog3 (String name, int age, String breed) { //생성자
		super(name, age);
		//부모생성자 호출, 자식이 부모의 초기화 작업을 이어받음
		this.breed = breed;
	}
	
	void showDog(){
		show();
		System.out.println("품종: "+breed);
	}
	
	
}	
