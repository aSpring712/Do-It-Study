package Session1.com.gilbut.chapter2;

import java.util.Calendar;
import java.util.Date;

// p.062 참조형 변수 예제
public class ReferenceExample {

	public static void main(String[] args) {
		// 참조 변수형 -> 클래스
		String lastName = "Kim";
		String firstName = new String("Benjamin");

		Date endDate = new Date();
		Date nowDate = Calendar.getInstance().getTime();
		
		System.out.println("My full name is " + firstName + " " + lastName);
		System.out.println(endDate);
		System.out.println(nowDate);
	}

}
