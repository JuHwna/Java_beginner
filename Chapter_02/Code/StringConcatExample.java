package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		// + 연산에서의 문자열 자동 타입 변환
		// 피연산자가 모두 숫자일 경우, 덧셈 연산 수행. 피연산자 중 하나가 문자열일 경우, 나머지 피연산자도 문자열로 자동 변환
		
		int value=10+2+8;
		System.out.println("value: "+value);
		
		String str1=10+2+"8";
		System.out.println("str1: "+str1);
		
		String str2=10+"2"+8;
		System.out.println("str2: "+str2);
		
		String str3="10"+2+8;
		System.out.println("str3: "+str3);
		
		String str4="10"+(2+8);
		System.out.println("str4: "+str4);
	}

}
