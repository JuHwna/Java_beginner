package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// 이항 연산자 : 피연산자가 2개인 연산자. 산술 연산자, 문자열 결합 연산자, 비교 연산자, 논리 연산자, 대입 연산자
		// 산술 연산자(+,-,*,/,%) : boolean 타입을 제외한 모든 기본 타입을 사용할 수 있음
		// 산술 연산자의 특징 : 피연산자들의 타입이 동일하지 않을 경우 다음과 같은 규칙을 사용해서 피연산자들의 타입을 일치시킨 후 연산 수행
		// 1. 피연산자들이 byte, short,char 타입일 경우 모두 int타입으로 변환된 후에 연산을 수행함
		// 2. 피연산자들이 모두 정수 타입이고 long 타입이 포함되어 있을 경우, 모두 long타입으로 변환된 후 연산을 수행함
		// 3. 피연산자 중 실수 타입(float,double)이 있을 경우, 허용 범위가 큰 실수 타입으로 변환된 후 연산을 수행함
		
		int v1=5;
		int v2=2;
		
		int result1=v1+v2;
		System.out.println("result1="+result1);
		
		int result2=v1-v2;
		System.out.println("result2="+result2);
		
		int result3=v1*v2;
		System.out.println("result3="+result3);
		
		int result4=v1/v2;
		System.out.println("result4="+result4);
		
		int result5=v1%v2;
		System.out.println("result5="+result5);
		
		double result6=(double)v1/v2;
		System.out.println("result6="+result6);

	}

}
