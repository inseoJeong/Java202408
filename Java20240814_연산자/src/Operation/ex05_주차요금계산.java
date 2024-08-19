/*
 	주차장을 이용한 시간에 따라 주차요금을 계산하는 프로그램을 작성하세요.
 	주차요금은 다음과 같습니다.
 	0~1시간 1000원, 1시간초과~2시간 2000원, 2시간초과~3시간 3000원, 3시간초과 5000원
  
  	출력 예) 주차 시간을 입력하세요 (시간단위: 2.5)
    주차 요금은 3000원입니다.
 */
package Operation;

import java.util.Scanner;

public class ex05_주차요금계산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주차 시간을 입력하세요. (시간 단위):");
		
		double hour = sc.nextDouble();
		
		int price;
		
		if(hour==0 && hour<=1) {          
			price = 1000;                     
		}else if(hour>1 && hour<=2) {   
			price = 2000;                   
		}else if(hour>2 && hour<=3) {  
			price = 3000;                  
		}else {   
			price = 5000;                    
		}
		
		System.out.printf("주차시간: %.1f시간, 주차 요금은 %d원입니다.", hour, price);
		
		
	}

}
