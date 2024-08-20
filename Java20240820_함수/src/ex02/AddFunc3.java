package ex02;

public class AddFunc3 {

	public static void main(String[] args) {
	
		//정수 값 10 넘겨주면 함수에서 1~10까지 평균을 리턴시킨다.
		
		double result = func(100);  //여기 type과
		
		System.out.println(result);
		
		
		int num = 10;               //기본자료형
		int[] nArr = {1,2,3,4,5};   //참조형
	
	}
	
	
	static double func(int n) {  //여기 type이 일치해야 함.
		
		int sum = 0;
		
		for(int i=0; i<=n; i++)  //여기 type과
			sum += i;
		
		return (double)sum/n;  //여기 type이 일치해야 함.
	}
	
	
  }
