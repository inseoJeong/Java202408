package ex03;

import java.util.Scanner;

public class 연습문제7_141p {

	public static void main(String[] args) {
		
		
		int balance = 0; //잔고
		int deposit = 0; //예금
		int withdrawal = 0; //출금
		
		boolean flag = true; //boolean 참 or 거짓 판단하기
		
		while(flag) {		
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");

			
			Scanner sc = new Scanner(System.in);

			// "1" ==> 1
			System.out.println("선택> ");
			int num = Integer.parseInt(sc.nextLine());  //Integer 문자형을 정수형으로 변환하기
			
			switch(num) {  //switch 조건문 숫자는 물론, 문자, 문자열도 가능하다.
			case 1:
				System.out.println("예금액> ");
				deposit = Integer.parseInt(sc.nextLine()); //deposit 예금, Integer 문자형을 정수형으로 변환하기
				balance += deposit;   //잔고에 예금을 더하는 것
				break;
			case 2:
				System.out.println("출금액> ");
				withdrawal = Integer.parseInt(sc.nextLine());  //deposit 예금, Integer 문자형을 정수형으로 변환하기
				balance -= withdrawal; //잔고에 출금을 빼는 것
				break;
			case 3:
				System.out.println("잔고> " +balance); 		
				break;
			case 4:
				flag = false;
			default:
					System.out.println("1~4 사이 숫자만 입력 하세요.");
			
			}
		
			
		}
	
	System.out.println("프로그램 종료!!"); //while문 밖으로 나와야 함.
	
	}

}
