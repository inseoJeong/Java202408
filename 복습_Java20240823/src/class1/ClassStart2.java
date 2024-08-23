package class1;

public class ClassStart2 {

	public static void main(String[] args) {
	
		// 배열을 사용한 방법
		
		/* 배열을 사용해서 코드 변경을 최소화했지만, 한 학생의 데이터가 studentNames[],
		   studentAges[], studentGrades[]라는 3개의 배열에 나누어져 있다.
		   따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다.
		   
		   ex) 학생2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 제거해줘야 한다.
		 	   -> 모든 배열의 인덱스 순서를 항상 정확하게 맞추어야하는데 실수할 가능성이 매우 높다.
		 */
		
		String[] studentNames = {"학생1", "학생2"};
		int[] studentAges = {15, 16};
		int[] studentGrades = {90, 80};
		
		for(int i=0; i<studentNames.length; i++) {
			System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrades[i]);
		}

	}

}
