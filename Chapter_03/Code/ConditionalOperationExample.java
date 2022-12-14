package sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 삼항 연산자(?:) : 3개의 피연산자를 필요로 하는 연산자
		// 삼항 연산자는 ? 앞의 조건식에 따라 콜론(:) 앞뒤의 피연산자가 선택된다고 해서 조건 연산식이라고 부르기도 함
		// 삼항 연산자를 사용하는 방법 : 조건식(피연산자1) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3)
		// 조건식을 연산하여 true가 나오면 삼항 연산자의 결과는 피연산자2가 됨
		// 조건식을 연산하여 false가 나오면 삼항 연산자의 결과는 피연산자3이 됨
		// 피연산자2와 피연산자3에는 주로 값이 오지만 경우에 따라서는 연산식이 올 수 있음
		// 삼항 연산자는 if문으로 변경해서 작성할 수도 있지만 한 줄에 간단하게 작성하여 삼항 연산자를 사용하는 것이 더 효율적임
		int score=85;
		char grade=(score>90) ? 'A' : ((score>80)? 'B':'C');
		System.out.println(score+"점은 "+grade+"등급입니다.");
	}

}
