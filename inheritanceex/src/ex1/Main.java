package ex1;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog(); //Dog클래스가 Animal클래스에게 상속받음. 따라서 Dog클래스는 Animal클래스의 기능을 사용할 수 있음. (private 제외)
		
		d.name = "뽀삐";
		d.age = 2;
		d.color = "검정";
		
		System.out.println(d.name+", "+d.age+", "+d.color);
		
		d.eat(); //부모 클래스 메서드 호춯
		d.sleep();
		//자식 클래스 메서드 호춯
		d.bark();
		d.run();
//		d.show();
	}
}
