package ex02;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("정인서", 30);
		
		person.introduce();
		person.walk();
		System.out.println("---------------------------------");
		Student student = new Student("정인서", 30, "한양대학교", "2017053254");
		
		student.introduce();
		student.walk();
		student.study();

		System.out.println("---------------------------------");
		SalesMan sales = new SalesMan("정인서", 30, "삼성", 10000);
		sales.introduce();
		sales.walk();
		sales.work();
	}

}
