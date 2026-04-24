package javastart;
class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
}


public class Array1 {
	
	public static void main(String[] args) { //실행
//		Circle [] c;
//		c = new Circle[5];
		Circle [] c = new Circle[5];
//		Circle [] c = {new Circle(0), new Circle(1), new Circle(2)};
		
		for (int i = 0; i<c.length; i++) {
			c[i] = new Circle(i);
			System.out.println(c[i].getArea());
		}
		


	}
}

