package exceptionex;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.: ");
		try {
			int n = sc.nextInt();
			sc.nextLine();
			sc.close();
			if (n%2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} catch (InputMismatchException e) { //정수가 아닌 다른 형의 값을 입력한 경우
			System.out.println("입력이 잘못되었습니다.");
		} finally { //예외 여부 관계없이 항상 수행
			System.out.println("프로그램이 종료되었습니다.");
		}
	}
}
