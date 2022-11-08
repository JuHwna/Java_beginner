package sec02.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		// 비교 연산자(<,<=,>,>=,==,!=) : 피연산자의 대소 또는 동등을 비교해서 true/false를 산출함
		// 대소 연산자는 boolean을 제외한 기본 타입에 사용할 수 있고 동등 연산자는 모든 타입에 사용할 수 있음
		// 비교 연산자는 흐름 제어문인 조건문(if), 반복문(for while)에서 주료 이용되어 실행 흐름을 제어할 때 사용됨.
		// 만약 피연산자가 char 타입이면 유니코드 값으로 비교 연산을 수행함
		
		int num1=10;
		int num2=10;
		boolean result1=(num1==num2);
		boolean result2=(num1!=num2);
		boolean result3=(num1<num2);
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		
		char char1='A';
		char char2='B';
		boolean result4=(char1<char2);
		System.out.println("result4="+result4);

	}

}
