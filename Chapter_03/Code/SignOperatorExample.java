package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 연산자 구분 : 필요로 하는 피연산자의 수에 따라 단항, 이항, 삼항
		// 단항 연산자 : 피연산자 하나만을 요구(부호 연산자, 증감 연산자) (ex ++x)
		// 이항 연산자 : 그 이외의 모든 연산자                      (ex x+y)
		// 삼항 연산자 : 조건식, a,b와 같은 3개의 피연산자 필요(조건 연산자) 

		// 단항 연산자 : 피연산자가 단 하나뿐인 연산자를 말함. 부호 연산자(+,-), 증감 연산자(++,--), 논리부정 연산자(!)가 있음
		// 부호 연산자(+,-) : 양수 및 음수를 표시하는 +,-. boolean 타입과 char 타입을 제외한 나머지 기본 타입에서 사용할 수 있음
		// +,- 산술 연산자이기도 하고 부호 연산자이기도 한데 부호 연산자로 쓰일 때에는 하나의 피연산자만 필요함, 일반적으로 부호 연산자는 정수 및 실수 리터럴 앞에 붙여 양수 및 음수 표현함
		
		int x=-100;
		int result1= +x;
		int result2= -x;
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		byte b=100;
		// byte result3=-b;
		int result3=-b;
		System.out.println("result3="+result3);
	}

}
