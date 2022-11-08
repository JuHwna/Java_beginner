package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// 비교 연산자에서도 연산을 수행하기 전에 피연산자의 타입을 일치시킴
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);
		
		double v4=0.1;
		float v5=0.1f;
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);
		
		// String 문자열을 비교할 때에서는 대소 비교 연산자를 사용할 수 없고, 동등 비교 연산자는 사용할 수 있으나 문자열이 같은지, 다른지를 비교하는 용도론느 사용되지 않음
		// 기본 타입(byte,char,short,int,long,float,double,boolean) 변수의 값을 비교할 때에는 ==연산자를 사용
		// 참조타입인 String 변수를 비교할 때에는 equals() 메소드를 사용함
	}

}
