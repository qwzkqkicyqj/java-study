package javaex;

class Person {
	private int age; //private: 그 클래스만 접근

	public int getAge() { //get~: 값을 변환
		return age;
	}

	public void setAge(int age) { //set~:값을 설정
		//나이가 1~100세 까지 -> 아니면 "나이 입력 오휴(1~100세 입력)"
		if(age < 1 || age > 100) {
			System.out.println("나이 입력 오휴(1~100세 입력)");
		}else {
			this.age=age;
		}
	}
	

}

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		//p.age = 21 -> age가 private이기 때문에 오륙 발생.
		p.setAge(12); // 값을 설정
		System.out.println("현재나이: "+p.getAge()); //값을 가져옴
	}
}
