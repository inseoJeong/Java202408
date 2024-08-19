package ex01;

public class Continue2 {

	public static void main(String[] args) {
		

		
		// 2의배수 ||(또는) 3의배수 아닌 숫자만 출력(1~10사이)
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0 || i%3 == 0) continue;  // if(i를 2로 나눴을 때 or 3으로 나눴을 때) 0이 아닌 값을 출력하라. 계속;
		
			System.out.print(i + ", ");
			
			}		
		}
}