package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// 논리 연산자: 논리곱(&&), 논리합(||), 배타적 논리합(^), 논리 부정(!) 연산을 수행함
		// 논리 연산자의 피연산자는 boolean 타입만을 사용할 수 있음
		// &&와 &는 산출 결과는 같지만 연산 과정이 조금 다름
		// &&는 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않고 바로 false라는 산출 결과를 냄
		// &는 두 피연산자 모두를 평가해서 산출 결과를 냄. 따라서 &보다는 &&가 더 효율적으로 동작함
		
		// ||와 |도 산출 결관느 같지만 연산 괒어이 다름(&&와 &의 차이와 같음)
		// 논리 연산 : 흐름 제어문인 조건문(if), 반복문(for, while) 등에서 주로 이용됨
		// if문의 조건식으로 비교 연산자와 논리연산자들이 주로 사용됨
		
		int charCode='A';
		
		if( (charCode>=65)&(charCode<=90)) {
			System.out.println("대문자군요");
		}
		
		if ((charCode>=97)&&(charCode<=122)){
			System.out.println("소문자군요");
		}
		
		if (!(charCode<48)&&!(charCode>57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value=6;
		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if ((value%2==0)||(value%3==0)) {
			System.out.println("2 또는 3의 배수군요");
		}

	}

}
