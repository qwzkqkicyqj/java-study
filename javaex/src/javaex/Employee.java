package javaex;

public class Employee { //캡슐화(묶어놓은 것)
	private String name; //멤버변수(속성) //private -> 정보 은닉(접근하지 못하도록)
	private int no;
	private int pay;
	
	
	
	public String getName() { //메서드(기능)
		return name;
	}
	public void setName(String name) {
		System.out.println("이름은 수정할 수 없습니다.");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		System.out.println("이름은 수정할 수 없습니다.");
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		if (pay < 2200000) {
			System.out.println("최저임슴 미만입니다. 확인해보세요.");
		} else {
			System.out.println("급여를 수정합니다.");
			this.pay = pay;
		}
		this.pay = pay;
	}
	Employee (String name, int no, int pay) { //생성자
		this.name = name;
		this.no=no;
		this.pay=pay;
	}
	public void print() {
		System.out.println("이름: "+name+" / 사번: "+no+" / 월급: "+pay);
	}
}
