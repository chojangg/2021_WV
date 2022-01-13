package test_final1;

public class Parent {
//	final 필드는 초기화된 값만 사용할 수 있고 변경이 불가능하다.(필드 값 변경 금지)
	public static final int REST_TIME = 10;
	
	public final void rest() {
//		restTime = 20;
		System.out.println(REST_TIME+"10분간 휴식을 한다.");
	}
}
