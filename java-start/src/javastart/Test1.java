package javastart;

class person {
	String name, name2;
	int age;
	person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String name() {
		System.out.println(name);
		return name;
	}
	
	String checkAdult(){
		if (age >= 19) {
			System.out.println("성인");
			return "성인";
		} else if (age >= 10) {
			System.out.println("청소년");
			return "청소년";
		} else {
			System.out.println("소인");
			return "소인";
		}
	
	}
	int age() {
		return this.age;
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		String name, c;
		int age;
		person t1 = new person("홍길동", 23);
		name = t1.name;
		age = t1.age;
		c = t1.checkAdult();
		System.out.println("이름: "+name+"/나이: "+age+"/구분: "+c);
	}

}
