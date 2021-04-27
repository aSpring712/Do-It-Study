package Session1.com.gilbut.chapter3;
// p.077
public class NotOperation {

	public static void main(String[] args) {
		boolean isWorking = false;
		
		isWorking = !isWorking; // false 값을 가진 isWorking 변수에 NOT 연산 후 다시 isWorking 변수에 대입
		System.out.println("isWorking : " + isWorking); // true
		isWorking = !isWorking;
		System.out.println("isWorking : " + isWorking); // false
	}

}
