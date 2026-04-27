package exceptionex;

public class Exception03 {
	public static void main(String[] args) {
		try {
			int a[] = {1,2};
			System.out.println(a[5]);
			
			String str = null;
			System.out.println(str.length());
			
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		} catch(NullPointerException e) {
			System.out.println("null레퍼런스를 참조하였습니다.");
		} catch(Exception e) { //Exception: 모든 예외, 항상 마지막
			System.out.println("기타 예외");
		}
		//catch 문장이 여러개일시, 첫 번째로 해당되는 catch만 실행된다. (나머지 실행 안됨.)
	}
}
