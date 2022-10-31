package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 연산식에서 모든 변수가 int 타입으로 변환되는 것은 아님
		// 두 피연산자 중 허용 범위가 큰 타입으로 변환되어 연산을 수행함.
		byte value1=10;
		int value2=100;
		long value3=1000L;
		long result=value1+value2+value3;
		System.out.println(result);

	}

}
