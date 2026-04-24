package javastart;
import java.util.Scanner;
//설계클래스
class Menu {
	String order;//멤버변수(필드)

 Menu(String order) {  
    this.order = order;//생성자 실행
 }

 // 메서드
 void printMenu() {
    System.out.println("변완수 카페의 메뉴는: " + order);
    
 }
}

//실행 메서드
public class MainMenu {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 객체 배열 생성 및 초기화
    // 첫번째 방법(배열 생성 후 배열 객체에 하나씩 저장)
    Menu menuArr[] = new Menu[3]; // Menu 객체를 3개 저장할 수 있는 배열을 만듬
    menuArr[0] = new Menu("Coffee"); // 생성자 호출
    menuArr[1] = new Menu("Tea");
    menuArr[2] = new Menu("Juice");

//       두번째 방법(한번에 초기화)
//       Menu[] menuArr = {
//          new Menu("Coffee"),
//          new Menu("Tea"),
//          new Menu("Juice")
//      };      

//        세번째 방법 (배열 생성-> 메뉴이름배열(데이터)->for문으로 자동 저장)
//        Menu[] menuArr = new Menu[3];
//        String[] names = {"Coffee", "Tea", "Juice"};
//        for(int i = 0; i < menuArr.length; i++) {
//           menuArr[i] = new Menu(names[i]);
//        }

    
    while(true)        {
       System.out.print("메뉴 번호 입력 (0 입력 시 종료): ");
       int num = sc.nextInt();
       sc.nextLine();

       if (num == 0) {
          System.out.println("프로그램 종료");
          break;
     }

       switch (num) {
       case 1:
          menuArr[0].printMenu();
          break;
       case 2:
    	   menuArr[1].printMenu();
          break;
       case 3:
    	   menuArr[2].printMenu();

          break;
       default:
          System.out.println("없는 메뉴입니다.");
       }
    }

    sc.close();
 }
}