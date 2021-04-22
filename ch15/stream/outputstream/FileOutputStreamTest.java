package ch15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// p.529 파일에 한 바이트씩 출력하기
public class FileOutputStreamTest {
/*
 * FileOutputStream 생성 -> write() 메서드 활용 -> 파일에 정수 값을 저장하는 예제
 * 숫자를 해당하는 아스키 코드 값의 문자로 변환하여 저장!!!
 * 변환된 문자가 아닌 숫자 65 그대로를 출력하려면 -> DataOutputStream 사용
 */
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) { // output.txt 파일 이름으로 FileOutputStream 생성
			fos.write(65); // FileOutputStream은 파일에 숫자를 쓰면 해당하는 스키 코드 값으로 변환됨
			fos.write(66); // write 메서드에 따라 파일에 값을 출력(쓰고) 스트림을 닫는다
			fos.write(67);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다"); // Project 'First'를 새로고침 해서 생성된 output파일 확인하기
		// output.txt 파일이 생성되고 내용은 'ABC'로 입력되어있음 -> 다시 실행 시 출력 결과가 이전과 같음
		// -> 기존 ABC가 없어지고 새로운 ABC가 쓰인 것	
		// , true 추가하고 실행 시 -> 기존 ABC에 ABC가 이어서 출력됨
	}
}
