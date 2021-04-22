package ch15.stream.reader;

import java.io.FileReader;
import java.io.IOException;

// p.536 FileReader로 읽기
public class FileReaderTest {
/*
 * 문자 입출력 시 -> 바이트 단위로 읽어오면 깨짐? -> 문자 스트림을 사용해야 함!
 */
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
