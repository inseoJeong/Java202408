/* 사용자의 키와 몸무게를 입력받아, BMI(체질량지수)를 계산하고
   그 결과에 따라 메시지를 출력하는 프로그램을 작성하세요.
   
   BMI = 몸무게(kg) / (키(cm)*키(cm))
   
   BMI 18.5미만          : "저체중입니다."
   BMI 18.5이상 24.9 이하 : "정상체중입니다."
   BMI 25이상   29.9 이하 : "과체중입니다."
   BMI 30이상            : "비만입니다."
 */

package Operation;

import java.util.Scanner;

public class ex06_체질량지수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("키를 입력하세요.");
		double cm = sc.nextDouble();
		
		System.out.println("몸무게를 입력하세요.");
		double kg = sc.nextDouble();
				
		double bmi = kg / (cm*cm);
		
		
		
		if(bmi<18.5) {          
			System.out.println("저체중입니다.");                     
		}else if(bmi<=18.5 && bmi>=24.9) {   
			System.out.println("정상체중입니다.");;                   
		}else if(bmi<=25 && bmi>=29.9) {  
			System.out.println("과체중입니다.");              
		}else {   
			System.out.println("비만입니다.");    
		
			

		}
	}

}
