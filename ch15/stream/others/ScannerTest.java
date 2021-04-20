package ch15.stream.others;

import java.util.Scanner;

// p.518 Scanner 테스트하기
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("직업 입력");
		String job = sc.nextLine(); // 문자열을 읽는 nextLine() 메서드로 이름과 직업 입력받음
		System.out.println("사번 입력");;
		int num = sc.nextInt(); // int형을 읽는 nextInt() 메서드로 사번을 입력받음
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);

	}

}
