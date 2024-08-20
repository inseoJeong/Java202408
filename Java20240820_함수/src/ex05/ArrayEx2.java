package ex05;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] oldIntArry = {1,2,3};
		
		int[] newIntArry = new int[5];

		newIntArry = oldIntArry;
		for(int i=0; i<newIntArry.length; i++)
			System.out.println(newIntArry[i]);

		System.out.println("--------------------------");
		
		//oldIntArray2있는 값을 newIntArray2에 복사
		int[] oldIntArry2 = {1,2,3};
		int[] newIntArry2 = new int[5];
		
		for(int i=0; i<oldIntArry.length; i++)
			newIntArry[i] = oldIntArry2[i];
		
		oldIntArry[2]=300;
		for(int i=0; i<oldIntArry.length; i++)
			System.out.println(oldIntArry[i]);

		for(int i=0; i<newIntArry2.length; i++)
			System.out.println(newIntArry2[i]);
		
		
	}

}
