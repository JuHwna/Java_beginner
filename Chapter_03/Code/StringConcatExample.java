package sec02.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		// 문자열 결함 연산자(+) : 문자열을 서로 결합한느 연산자
		// + 연산자 : 산술 연산자, 부호 연산자인 동시에 문자열 결합 연산자임
		// 피연산자 중 한쪽이 문자열이면 +연산자는 문자열 결합 연산자로 상요되어 다른 피연산자를 문자열로 변환하고 서로 결합함.
		// 문자열과 숫자가 혼합된 + 연산식은 왼쪽에서부터 오른쪽으로 연산이 진행됨.
		
		String str1="JDK"+6.0;
		String str2=str1+" 특징";
		System.out.println(str2);
		
		String str3="JDK"+3+3.0;
		String str4=3+3.0+"JDK";
		System.out.println(str3);
		System.out.println(str4);

	}

}
