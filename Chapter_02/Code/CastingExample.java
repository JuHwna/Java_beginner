package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// 강제타입변환 : 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 나눠서 저장하는 것
		// 강제타입변환은 캐스팅 연산자 괄호 ()를 사용하는데, 괄호 안에 들어가는 타입은 나누는 단위이다.
		// 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입

		int intValue=44032;
		char charValue=(char)intValue;
		System.out.println(charValue);
		
		long longValue=500;
		intValue=(int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		System.out.println(intValue);
	}

}
