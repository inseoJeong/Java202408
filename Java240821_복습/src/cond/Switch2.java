package cond;

public class Switch2 {

	public static void main(String[] args) {

		
		//Switch문은 경우의 수가 많을 때 if문을 좀 더 편리하게 사용할 수 있음.
		
		int grade = 5;
		
		int coupon;
		switch (grade) {
		case 1:
			coupon = 1000;
			break;
		case 2:
			coupon = 2000;
			break;
		case 3:
			coupon = 3000;
			break;
		default:
			coupon = 500;
			break;
	
		}
		System.out.println("발급받은 쿠폰" + coupon);
		
		
		}

	}
		

