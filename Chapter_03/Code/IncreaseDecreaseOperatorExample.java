package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감 연산자(++,--) : 변수의 값을 1 증가시키거나 1 감소시키는 연산자, boolean 타입을 제외한 모든 기본 타입의 피연산자에서 사용 가능
		// 연산식 | ++ 피연선자 : 다른 연산을 수행하기 전에 피연산자의 값을 1 증가시킴
		//      | -- 피연산자 : 다른 연산을 수행하기 전에 피연산자의 값을 1 감소시킴
		//      | 피연산자 ++ : 다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴
		//      | 피연산자 -- : 다른 연산을 수행한 후에 피연산자의 값을 1 감소시킴
		
		// 위치의 중요성
		// 증감 연산자가 변수 앞에 있으면 우선 변수값을 1 증가 또는 1 감소시킨 후에 다른 연산자를 처리함
		// int x=1, int result1= ++x+10; 12가 됨
		// 증감 연산자가 변수 뒤에 있으면 다른 연산자를 먼저 처리한 후 변수 값을 1 증가 또는 1 감소시킴
		// int y=1, int result2= y++ +10; 11가 됨
		
		int x=10;
		int y=10;
		int z;
		
		System.out.println("--------------------------");
		x++;
		++x;
		System.out.println("x="+x);
		
		System.out.println("--------------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("--------------------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("--------------------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("--------------------------");
		z=++x+y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
