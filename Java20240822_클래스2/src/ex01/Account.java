package ex01;

public class Account {

	
	// private 는 해당 멤버를 선언한 클래스 내에서만 접근할 수 있도록 제한하는 것.
			
	
	
			private int balance;                 //잔액
			
			void deposit(int amount) {
				balance += amount;
			}
			
			void withdraw(int amount) {
				
				if(balance > amount) {
					balance -= amount;
				}else {
					System.out.println("잔액부족");
				}
			}
			
			int getBalnace() {
				return balance;
			}
			
			
			
	}