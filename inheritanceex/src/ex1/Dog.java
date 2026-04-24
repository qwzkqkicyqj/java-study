package ex1;
//자식 클래스 (부모클래스: Animal)
public class Dog extends Animal{
	public void bark() {
		System.out.println(name+"가 멍멍 짖습니다.");
	}
	public void run() {
		System.out.println(name+"가 잘 달립니다.");
	}
	
}
