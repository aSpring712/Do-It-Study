package ch14.exception;
// p.501 throws로 예외 미루기

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Add throws declaration -> throws 선언을 추가한다
 * -> 예외를 해당 메서드에서 처리하지 않고 미룬 후 메서드를 호출하여 사용하는 부분에서 예외를 처리하는 방법
 */
public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { // throws -> 처리를 미루겠다
		// FileInputStream을 열고 Class를 동적으로 로딩하여 반환
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
		Class c = Class.forName(className); // ClassNotFoundException 발생 가능
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException(); 
		//try {
			try { // 메서드를 호출해서 사용할 때 예외를 처리함
				test.loadClass("a.txt", "java.lang.String");
			} catch (FileNotFoundException e) { // 각 예외 상황마다
				e.printStackTrace();
			} catch (ClassNotFoundException e) { // 다른 방식으로 처리함
				e.printStackTrace();
			} catch (Exception e) { // Exception 클래스로 그 외 예외 상황 처리 -> 기본(default) 예외 처리
				/* 예외는 catch문을 선언한 순서대로 검사 -> 가장 아래에 놓아야 함 */
				e.printStackTrace();
			}
		//}
		//catch (FileNotFoundException | ClassNotFoundException e) { // 여러 예외 처리를 한 문장으로 처리함
//			e.printStackTrace();
//		} 

	}

}
