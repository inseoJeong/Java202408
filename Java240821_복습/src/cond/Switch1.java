package cond;

public class Switch1 {

	public static void main(String[] args) {

		
		//Switch문은 경우의 수가 많을 때 if문을 좀 더 편리하게 사용할 수 있음.
		
		int grade = 2;
		
		int coupon;
		if (grade == 1) {
			coupon = 1000;
		} else if (grade == 2) {
			coupon = 2000;
		} else if (grade == 3) {
			coupon = 3000;
		} else {
			coupon = 500;
		}
		System.out.println("발급받은 쿠폰 " + coupon);
		}

	}
		

