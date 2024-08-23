package ex05;

public class Car {
	
		String model;
		static int count;   	  	 // 클래스(static) 변수(count)
		
		Car(){}                    		 // 매개변수가 없는 기본 생성자
		Car(String model) {   		//문자열 클래스(String)
				this.model = model;
				++count;
		
			}
		
		void infoCar() {
			System.out.println("차량 구입, 이름: " + this.model);
		}
		
		static void showTotalCars() {
				System.out.println("구매한 차량 수: " + count);
		}
}
			
			
			
	