package ex05;

import java.util.Scanner;

public class 조건문_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>> ");
		int num = sc.nextInt();
		
		//삼항 연산자로 합격 불합격 판단
		
//		String result = (num>60) ? "합격" : "불합격";
//		System.out.println(result);

		
		String result = "";  // (1)점수 62일 때 , (2)점수 52일 때
		
		if(num>=60) {        // (1)조건 참이므로 실행
			result = "합격";
		}
		
		if(num<60) {         //(1)참 실행 돼서 실행X (2)조건 합격이 아니기때문에 실행
			result = "불합격";
		}
		System.out.println(result);
	
	
	
	
	}

}
