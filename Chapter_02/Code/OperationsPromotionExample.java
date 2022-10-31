package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// 실수 연산에서의 자동 타입 변환
		// int 타입과 double 타입을 연산해도 동일한 과정을 거침
		// 먼저 int 타입의 피 연산자가 double 타입으로 자동 전환되고 연상르 수행함
		// 꼭 int 타입으로 연산을 해야 한다면 double 타입을 int 타입으로 강제 변환하고 덧셈 연사을 수행하면 됨
		
		// 자바에서는 소문자 f 또는 대문자 F가 없는 실수 리터럴을 double 타입으로 해석함
		// float 타입으로 저장하고 싶으면 실수 리터럴 뒤에 소문자 f나 대문자 F를 붙여야 함.
		
		// 정수 타입을 실수 타입으로 변환하는 방법
		// float floatValue=(float) 정수;
		// double doubleValue=(double) 정수;
		byte byteValue1=10;
		byte byteValue2=20;
		//byte byteValue3=byteValue1+byteValue2 <-컴파일에러
		int intValue1=byteValue1+byteValue2;
		System.out.println(intValue1);
		
		char charValue1='A';
		char charValue2=1;
		// char charValue3=charValue1+charValue2 <-컴파일에러
		int intValue2=charValue1+charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4;
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0 <-컴파일에러
		double doubleValue=intValue5/4.0;
		System.out.println(doubleValue);
		
		int x=1;
		int y=2;
		double result=(double) x/y;
		System.out.println(result);
	}

}
