/*버스 요금 계산 프로그램
		 * 기본요금 2000원
		 * 1~5세 무료, 6~12세 50%할인, 13~18세 25%할인, 19~64세 0%할인, 65세이상 무료
		 * 예) 25입력 --> 버스요금 : 2000원
		 */

package Operation;

public class ex04_버스요금계산 {

	public static void main(String[] args) {
		
		int age = (int)(Math.random()*100)+1; //100세까지 랜덤으로 숫자(정수) 돌리기
		System.out.println("나이를 입력하세용");
		
		int fee = 2000;  //기본 값 정의
		double rate = 0;
		
		if(age >=65 || age<=5) {          // 65세 이상 or 5세 이하
			rate = 0;                     // 0%
		}else if(age >=6 && age <=12) {   // 6세 이상 and 12세 이하
			rate = 0.5;                   // 50%
		}else if(age >=13 && age <=18) {  // 13세 이상 and 18세 이하
			rate = 0.75;                  // 15%
		}else if(age >=19 && age <=64) {  // 19세 이상 and 64세 이상  
			rate = 1;                     // 100%
		}
		
		int result = (int)(fee * rate);  //요금(fee)과 할인율(rate) 곱하기	
		System.out.printf("나이: %d세, 버스 요금은 %d원\n", age, result);
				
	}

}
