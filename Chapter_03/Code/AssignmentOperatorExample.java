package sec02.exam10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 대입 연산자 : 오른쪽 피연산자의 값을 왼쪽 피연산자의 변수에 저장함. 오른쪽 피연산자에는 리터럴 및 변수, 다른 연산식이 올 수 있음
		// 단순히 오른쪽 피연산자의 값을 변수에 저장하는 단순 대입 연산자가 있고 정해진 연산을 수행한 후 결과를 변수에 저장하는 복합 대입 연산자도 있음.
		// 대입 연산자는 모든 연산자들 중에서 가장 낮은 연산 순위를 가지고 있기 때문에 제일 마지막에 수행함
		
		int result=0;
		result+=10;
		System.out.println("result="+result);
		result-=5;
		System.out.println("result="+result);
		result*=3;
		System.out.println("result="+result);
		result/=5;
		System.out.println("result="+result);
		result%=3;
		System.out.println("result="+result);

	}

}
