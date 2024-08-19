package Operation;

public class ex02_시간나타내기 {

	public static void main(String[] args) {
		/* 	num에는 4000을 입력하세요.
		   	4000을 시 분 초로 출력해주세요.
		   	예) 1시간 6분 40초
		 */
		
		int num = 4000;
		int hours = num / 3600;   //4000분을 초(3600(1시간))로 나누면 1.111111
		int minute = 400 / 60;    //4000/3600하면 나머지 400, 나머지(400)을 분(60)으로 나누면 6분
		int second = 400 % 60;    // %는 나머지 구하는 것, 400나누기60을 6으로 나눴을 때 나머지는 40초
		
		System.out.printf("%d시간", hours);  //숫자 옆 글자 나오려면 print 뒤에 f를 쓰고, ("%d시간",결과값); 
		System.out.printf("%d분", minute);  //숫자 옆 글자 나오려면 print 뒤에 f를 쓰고, ("%d분",결과값); 
		System.out.printf("%d초", second);  //숫자 옆 글자 나오려면 print 뒤에 f를 쓰고, ("%d초",결과값); 
	
		
	}

}
