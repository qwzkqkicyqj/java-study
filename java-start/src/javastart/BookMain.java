package javastart;

class Book2 { //클래스 = 변수(속성)+메서드(기능)
	void show() { //메서드(함수)
		System.out.println("제목: "+title+" / 작가: "+author);
	}
	String title = "";
	String author = "";
	Book2(){
		this("",""); //생성자간의 호출 //2
		System.out.println("기본생성자 호출");//4
	}
	Book2(String title){ //생성자 호출시 title만 가져옴
		//this.title=title; //왼쪽 title: 멤버변수, 오른쪽 title: 매개변수	
		//author = "작가 미상";
		this(title, "작가 미상");
	}
	Book2(String title, String author){//3
		this.title=title; 
		this.author=author;
	}
}

	
public class BookMain {
	public static void main(String[] args) { //실행부분
		Book2 b1 = new Book2(); //객체 생성 //생성자 진입
		Book2 b2 = new Book2("홍길동전"); //b2: 참조변수(주소 기억)
		Book2 b3 = new Book2("소년이 온다", "한강");
		
		b1.show();
		b2.show();
		b3.show();
	}
}

//this는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//this() 설명
//① 생성자에서만 사용 가능
//this();  // 생성자 안에서만 사용 가능
//② 반드시 첫 줄에 써야 함 *****
//Car() {
//    this("Avante");  // 반드시 첫 줄
//}
//
//Car() {
//    speed = 100;
//    this("Avante"); // 에러
//}
//③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//Car() {
//    this(); //  무한 호출 → 컴파일 에러
