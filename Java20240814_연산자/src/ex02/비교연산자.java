package ex02;

public class 비교연산자 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 == num2);  //같다.     //false
		System.out.println(num1 != num2);  //같지 않다. //true
		
		System.out.println(num1 > num2);  //false
		System.out.println(num1 >= num2); //false
		
		System.out.println(num1 < num2);  //true
		System.out.println(num1 <= num2); //true
		
	}

}
