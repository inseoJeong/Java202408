package ex02;

public class 논리연산자 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println( (num1 == num2) && (num1 != num2) ); // and 논리곱
		
		System.out.println( (num1 == num2) || (num1 != num2) ); // or 논리합

		System.out.println( !((num1 == num2) && (num1 != num2)) ); // not 논리부정,피연산자의 논리값을 바꿈
		

	}

}
