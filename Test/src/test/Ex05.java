//오류수정

package test;

class Book {
	String title;
	
	Book (String title){
		this.title = title;
	}

}

public class Ex05 {
	public static void main(String[] args) {
		Book[] b = new Book[3];
		b[0] = new Book("홍길동전");
		b[1] = new Book("심청전");
		b[2] = new Book("구운몽");
		
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i].title);
		}
	}
}
