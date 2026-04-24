package test;

//자식클래스(서브클래스)
public class DogEx extends AnimalEx{
	String breed;
	
	DogEx(String name, int age, String breed) {
		super(name, age); //부모생성자 호출
		this.breed = breed;
	}
	
	void showDog() {
		System.out.println("품종: "+breed);
		super.show();
	}
}
