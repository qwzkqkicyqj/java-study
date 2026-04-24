package javastart;

class Car{ //클래스(설계도) 생성
   //클래스 = 멤버변수(필드) + 메서드(기능) 구성
   String model; //멤버변수
   int speed; //멤버변수
   // 생성자(constructor) : 객체 생성할 때 값을 부여
   // 객체 생성할 때 1번 수행
   Car(String model, int speed){ //생성자(클래스 이름과 동일)
	   this.model = model; //매개변수와 멤버변수 구분 (this사용시 멤버변수)
	   this.speed = speed; 
	   //this: 왼쪽 변수 - 객체변수(멤버변수), 오른쪽 변수 - 매개변수
	   //this: 객체 자신
   }
   
   Car(String model) {
	   this.model = model;
	   this.speed = 0;
   }
   
   Car(int speed){
	   this.speed = speed;
   }
   //메서드 정의(기능, 행위)
   void ShwoPrint(){
      System.out.println("모델명: "+model+"/스피드: "+speed);
   }
   
   Car() {
	   this.model = "기본";
	   this.speed = 0;
   }
   
   
}


public class MainCar { //실행하는 클래스

   public static void main(String[] args) { //main method
   
      Car s1 = new Car("Sonata", 100); //객체(인스턴스) 생성
      Car s2 = new Car("Avante", 80);
      Car model = new Car("트럭");
      Car novar = new Car();
      //Student(): 클래스
      //new: 객체 생성 연산자
      // s1: 참조변수, 객체 생성
      
      //s1.name = "홍길동"; //.(점)은 멤버 접근 연산자
      //s1.score= 90; 
      
      s1.ShwoPrint(); //메서드 호출
      
      
      //s2.name = "이순신"; //.(점)은 멤버 접근 연산자
      //s2.score= 100;
      s2.ShwoPrint();
      model.ShwoPrint();
      novar.ShwoPrint();
      

   }
   
}