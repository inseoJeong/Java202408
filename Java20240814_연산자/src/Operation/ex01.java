package Operation;

public class ex01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 20;
		int num3 = 35;
		
		int sum = num1 + num2 + num3;
		double average = (num1 + num2 + num3) / 3.0;
		
		System.out.printf("%d점\n",sum);
		System.out.printf("%.1f점",average);
	}

}
