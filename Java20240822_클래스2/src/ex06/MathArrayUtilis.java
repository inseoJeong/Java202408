package ex06;

public class MathArrayUtilis {

	private MathArrayUtilis() {}
	 // 매개변수가 없는 기본 생성자

	static int sum(int[] values) {

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	static double avg(int[] values) {
		double avg = 0.0;
		return avg;
	}

	static int min(int[] values) {
		return 0;
	}

	static int max(int[] values) {
		int max = values[0];

		for(int i=0; i<values.length; i++) {
			if(max < values[i]) {
				max = values[i];
			}
		
		}
		return max;
	}
	

}
