package ch15.stream.others;

import java.io.Console;

// p.519 Console 테스트하기
public class ConsolTest {

	public static void main(String[] args) {
		Console console = System.console(); // 콘솔 클래스 반환
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업");
		String job = console.readLine();
		System.out.println("비밀번호");
		char[] pass = console.readPassword(); // readPassword()의 반환형이 char[]
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
		
	}

}
