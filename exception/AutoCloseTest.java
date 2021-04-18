package ch14.exception;
// p.498 try-with-resources문 사용하기(1)
public class AutoCloseTest {
	public static void main(String[] args) {
		//try(AutoCloseObj obj = new AutoCloseObj()) { // 사용할 리소스 선언
		
		AutoCloseObj obj = new AutoCloseObj();
		try(obj) { // 향상된 try-with-resources문 -> 외부에서 선언한 변수를 그대로 쓸 수 있음(자바 9 이상)
			throw new Exception(); // 프로그램에서 강제로 예외를 발생시켜 catch 블록이 수행되도록 구현
		} catch (Exception e) {
			System.out.println("예외 부분입니다."); // 출력 결과 close() 메서드 먼저 호출 후 예외 블록 부분 수행 됨
		}
	}
}
