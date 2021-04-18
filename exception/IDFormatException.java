package ch14.exception;
// p.506 사용자 정의 예외 구현하기
public class IDFormatException extends Exception { // Exception 클래스 상속
	public IDFormatException(String message) { // 생성자 -> 예외 상황 메세지를 입력 받음
		super(message); // 예외 메시지 설정 -> getMassage() 메서드 호출 시 메시지 내용을 볼 수 있음 
	}
}
