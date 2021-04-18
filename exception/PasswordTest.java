package ch14.exception;

public class PasswordTest {
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	// Password에 대한 제약 조건 구현
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다");
		}
		else if(password.length() <= 5) {
			throw new PasswordException("비밀번호는 5자 이하일 수 없습니다");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류 없음1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		try {
			test.setPassword(password);
			System.out.println("오류 없음2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcdef";
		try {
			test.setPassword(password);
			System.out.println("오류 없음3");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcfr1";
		try {
			test.setPassword(password);
			System.out.println("오류 없음4");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
