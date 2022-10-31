package sec03.exan07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// 문자열을 기본 타입으로 갖에 타입 변환
		// 정수 및 실수 타입으로 변환해서 숫자 연산을 하는 경우임
		// 문자열이 숫자가 아닌 알파벳이나 특수 문자, 한글 등을 포함하고 있을 경우 숫자 타입으로 변환을 시도하면 숫자 형식 예외(NumberFormatException)가 발생함
		
		// 기본 타입(byte,short,char,int,long,float,double,boolean)의 값을 문자열로 변경하는 경우 0> string.valueOf() 메소드 이용
		// -> String str=String.valueOf(기본타입값);
		
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		boolean value3=Boolean.parseBoolean("true");
		
		System.out.println("value1: "+value1);
		System.out.println("value2: "+value2);
		System.out.println("value3: "+value3);
		
		String str1=String.valueOf(10);
		String str2=String.valueOf(3.14);
		String str3=String.valueOf(true);
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
	}

}
