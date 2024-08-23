package ex02;

public class DoWhile예제 {

	public static void main(String[] args) {
		
	/*
	 * for문: 몇 번 회전하는 지 아는 경우 사용.
	 * while문: 횟수를 모를 때 사용.
	 * for문이나 while문의 경우 조건이 거짓이면 한 번도 실행이 안될 수 있음.
	 * do~while문: 최소한 한번은 실행을 보장.  (많이 쓰지는 않음)
	 */
		int i=101;
		int sum=0;
		
		do {
			sum += i;
			i++;			
		}while(i<100);
		
		System.out.println(sum);
		
	}
}