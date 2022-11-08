package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		// char 타입도 정수 타입이어서 산술 연산이 가능함, 주의할 점 : int 타입으로 변환되어 연산 결과는 int 타입이 된다는 것
		char c1='A'+1;
		char c2='A';
		//char c3=c2+1; <-char 변수가 산술 연사에 사용되면 int 타입으로 변환되므로 연산 결과는 int타입이 됨
		char c3=(char)(c2+1);
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);
	}

}
