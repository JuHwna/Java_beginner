package sec02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// 논리 부정 연산자 : true를 false로, false를 true로 변경하기 때문에 boolean 타입에만 사용할 수 있음
		//                조건문과 제어문에서 조건식의 값을 부정하도록 해서 실행 흐름을 제어할 때 주로 사용함, 두 가지 상태(true,false)를 번갈아가며 변경하는 토글 기능 구현할 때 사용
		// ! 연산자 : 피연산자가 true면 false값을 산출, 피연산자가 false이면 true 값을 산출
		// 
		boolean play=true;
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
		
		play=!play;
		System.out.println(play);
	}

}
