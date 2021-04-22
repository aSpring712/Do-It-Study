package ch15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// p.530 파일에 한 바이트씩 출력하기
public class FileOutputStreamTest2 {
/*
 * 바이트 배열 활용 -> 여러 자료를 한꺼번에 출력 : write(byte[] b)
 */
	public static void main(String[] args) throws IOException {
		/* 향상된 try-with-resources문 -> 자바 9부터 제공 */
		FileOutputStream fos = new FileOutputStream("output2.txt", true); 
		try(fos) { // 기존에는 fos 자리에 바로 윗 문장을 모두 적어주어야 했음
			byte[] bs = new byte[26]; // 26개 크기 바이트 배열 생성
			byte data = 65;
			for(int i = 0; i < bs.length; i++) { // A ~ Z까지 배열에 넣기
				bs[i] = data; // 65~81
				data++;
			}
			fos.write(bs); // A~Z 까지 담겨있는 배열을 한꺼번에 출력
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 모든 에러 발생 경로와 에러 메시지를 모함하고 있음
			// e.toString() -> exception 유형(exception class name)과 message를 함께 출력
			// e.getMessage() -> 에러 메세지만 출력(어떤 종류의 에러가 발생했는지는 정보 제공을 하지 않음)
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
