package ch15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

// p.522 FileInputStream 사용하기
public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt"); // input.txt 파일 입력 스트림 생성 -> 아직 존재하지 않는 상태 -> FileNotFoundException 예외 발생
			// -> FileNotFoundException의 상위 예외 클래스인 IOException이 발생 -> IOException에서 catch됨
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		} catch (IOException e) { // 여기서 FileNotFoundException 캐치됨
			System.out.println(e);
		} finally { // fis.close()를 수행하려고 했는데, 스트림이 생성되지 않아서 NullPointerException 발생 -> 컴파일 오류가 발생하는 예외가 아니므로
			// 어떤 예외 클래스로 처리해야할지 모를 때 최상위 예외 클래스 Exception 사용하면 됨
			try {
				fis.close(); // 열린 스트림은 finally 블록에서 닫음
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) { // 스트림이 null인 경우
				System.out.println(e);
			}
		}
		System.out.println("end"); // end까지 출력됨 -> 예외 처리가 되어 프로그램이 중단되거나 멈춘 것이 아니라 end 부분까지 출력됨 ★예외처리의 중요성*
	}
}
