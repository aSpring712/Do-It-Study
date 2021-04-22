package ch15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

// p.538
public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt");) {
			fw.write('A'); // 문자 하나 출력
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf); // 문자 배열 출력
			fw.write("안녕하세요. 잘 써지네요"); // 문자열 출력
			fw.write(buf, 1, 2); // 문자 배열의 일부 출력 -> C, D가 출력될 것
			fw.write("65"); // 숫자 그대로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
		/* 결과
		 * ABCDEFG안녕하세요. 잘 써지네요CDA
		 * 
		 * FileOutputStream 사용 시 65출력 -> A가 출력되었음 -> 한 바이트로 해석되어 출력되기 때문
		 * 그냥 숫자 65 그대로 출력하고싶을 때 FileWriter 사용
		 * 
		 */
	}
}
