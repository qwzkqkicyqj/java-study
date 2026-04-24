package test;

//부모클래스(슈퍼클래스)
public class AnimalEx {
	String name;
	int age;
	
	AnimalEx(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}

}
