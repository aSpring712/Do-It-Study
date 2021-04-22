package ch15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// p.532 파일에 바이트 배열로 출력하기
public class FileOutputStreamTest3 {
/*
 * write(byte[] b, int off, int len) 메서드 : 전체 자료 출력 X, 배열의 off 위치부터 len 길이만큼 출력
 */
	public static void main(String[] args) {		 
		try(FileOutputStream fos = new FileOutputStream("output3.txt", true)) { // 기존에는 fos 자리에 바로 윗 문장을 모두 적어주어야 했음
			byte[] bs = new byte[26]; // 26개 크기 바이트 배열 생성
			byte data = 65;
			for(int i = 0; i < bs.length; i++) { // A ~ Z까지 배열에 넣기
				bs[i] = data; // 65~81
				data++;
			}
			fos.write(bs, 2, 10); // A~Z 까지 담겨있는 배열의 2번째 인덱스 즉 3번째 문자부터 10개 바이트 출력 -> 2~11
		} catch (IOException e) {
			e.printStackTrace(); // 모든 에러 발생 경로와 에러 메시지를 모함하고 있음
			// e.toString() -> exception 유형(exception class name)과 message를 함께 출력
			// e.getMessage() -> 에러 메세지만 출력(어떤 종류의 에러가 발생했는지는 정보 제공을 하지 않음)
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
