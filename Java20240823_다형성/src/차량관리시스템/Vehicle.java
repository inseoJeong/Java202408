package 차량관리시스템;

public class Vehicle {

		
		String licensePlate;  // 차량번호
		String owner; 
		
		public Vehicle(String licensePlate, String owner) {
			this.licensePlate = licensePlate;
			this.owner = owner;
		}
		
		void startEngine() { // 차량 시동을 거는 메서드
			System.out.println("차량이 시동을 걸었습니다.");

			}
		
		//정비 비용을 계산하는 메서드
		double calculateMaintenanceCost() {
			return 0;
		}			
		void printInfo() {
			System.out.println("차량 번호: " + licensePlate);
			System.out.println("소유자: " + owner);
		}
	}	
		
		
		
	/*	
		double calculateMaintenanceCost(); //정비 비용을 계산하는 메서드 
		
		for(double i=0; i<calculateMaintenanceCost.length; i++ ) {
		System.out.println("정비 비용:" + calculateMaintenanceCost[i]);
		}
			
			Vehicle licensePlate1;
			licensePlate1 = new Vehicle();
			
			licensePlate1.licensePlate = "23가 4567";
			licensePlate1.owner = "홍길동"; 
			System.out.println("차량이 시동을 걸었습니다.");
			licensePlate1.fuelType = "Gasoline";
			
		
			Vehicle licensePlate2;
			licensePlate2 = new Vehicle();
		
			licensePlate1.licensePlate = "789나 1011";
			licensePlate1.owner = "이순신"; 
			System.out.println("차량이 시동을 걸었습니다.");
	
	
	*/
		

