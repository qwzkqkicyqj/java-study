package javaex;
//부모클래스
class Shape {
	void draw() {
		System.out.println("도형을 그리다");
	}
	
}
//자식클래스
class Circle extends Shape {
	@Override //오버라이드: 재정의
	void draw() {
		System.out.println("원을 그리다");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("사각형을 그리다");
	}
}

public class Poly {
	public static void main(String[] args) {
		Shape t1 = new Shape();
		Shape t2 = new Circle();
		Shape t3 = new Rectangle();

		t1.draw();
		t2.draw();
		t3.draw();
	}
}
