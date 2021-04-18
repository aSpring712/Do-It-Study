package ch14.exception;
// p.491 14.예외처리 try-catch문 사용하기
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayExceptionHandling1 {
	public static void main(String[] agrs) {
		FileInputStream fis = null;
		
		try { // 파일이 없을 수도 있다
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); // 어디에서 예외가 발생했는지 따라가는 메서드
			System.out.println(e); // 예외발생 시 e의 toString 메서드가 호출되도록 코드 작성
			return; // return문(강제 return)이 있어도 fianlly는 항상 실행됨
		}  finally { // return문과 상관없이 항상 finally 블록이 실행됨
			if(fis != null) {
				try {
					fis.close(); // 파입 입력 스트림 닫기
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
			System.out.println("항상 수행됩니다");
		}
		System.out.println("여기도 수행됩니다."); // 정상 출력 -> 프로그램이 비정상적으로 종료되지 않았기 때문에 이 문장도 출력됨
	}
	/*
	 * 예외 처리를 한다고 해서 프로그램의 예외 상황 자체를 막을 수는 없으나
	 * 예외 처리를 하면 예외 상황을 알려 주는 메시지를 볼 수 있고, 프로그램이 비정상 종료되지 않고 계속 수행되도록 만들 수 있음
	 */
}
