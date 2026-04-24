package javastart;
import java.util.Scanner;


class StudentP{
	String name;
	int score;
	
	StudentP (String name, int score) {
		this.name = name;
		this.score = score;
	}
	

}

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력: "); //학생수 키보드로 부터 입력
		int cnt = sc.nextInt();
		sc.nextLine();
		StudentP stu[] = new StudentP[cnt]; //학생 수 만큼 배열 생성
		
		
		for (int i = 0; i<stu.length; i++) {
			System.out.print(i+1+"번째 학생 이름: ");
			String name = sc.nextLine();
			System.out.print(i+1+"번째 학생 성적: ");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name, score);
		}
		
		
		while(true) {
			boolean is = false;
			System.out.print("검색할 이름(stop입력시 종료): ");
			String sname = sc.nextLine();
			if (sname.equals("stop")) {
				break;
				
			}
			for (int i = 0; i<stu.length; i++) {
				if (stu[i].name.equals(sname)) {
					System.out.println(i+1+"에 위치함.");
					System.out.println(sname+"학생의 점수: "+stu[i].score);
					is = true;
					break; //break는 가장 가까운 반복문을 탈출한다. (1번만)	
				}
//			if (i+1 == stu.length) {
//				System.out.println(sname+"학생의 대한 정보가 없습니다.");
//			}
				
			}
			if (!is) {
				System.out.println(sname+"학생의 대한 정보가 없습니다.");
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
	} //main
} //class
