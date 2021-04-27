package Session1.com.gilbut.chapter2;
// p.064 형변환 -> 데이터 손실 예제
public class CastingExample {

	public static void main(String[] args) {
		int avgSalary = 1300000;
		int employee = 10;
		int storeNumber = 1300;
		int annualExpense1 = avgSalary * employee * 12 * storeNumber;
		long annualExpense2 = (long) avgSalary * employee * 12 * storeNumber;
		
		System.out.println("Annual Expense : " + annualExpense1);
		System.out.println("Annual Expense : " + annualExpense2);

	}

}
