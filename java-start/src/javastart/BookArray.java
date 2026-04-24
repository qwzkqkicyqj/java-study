package javastart;
import java.util.Scanner;

class BookA{
	String title;
	int price;
	BookA(String title, int price){
		this.title = title;
		this.price = price;
	}
	String title() {
		return title;
	}
	int price() {
		return price;
	}
	
}



public class BookArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookA test[] = new BookA[3];
		
		for (int i = 0; i<test.length; i++) {
			System.out.println("제목 입력: ");
			String title = sc.nextLine();
			System.out.println("가격 입력: ");
			int price = sc.nextInt();
			test[i] = new BookA(title, price);
			sc.nextLine();
		}
		sc.close();
		for (int j = 0; j<test.length; j++) {
			System.out.println("제목: "+test[j].title+" / 가격: "+test[j].price);
		}
	}
}
