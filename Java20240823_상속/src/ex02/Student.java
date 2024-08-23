package ex02;


//final class Student => Student 클래스 상속불가
//public final class Student extends Person
public class Student extends Person {

	private String school;
	private	String studentID;  //학번
	
	public Student() {}
	
	public Student(String school, String studentID) {
//	    this("Jeong", 30, school, studentID);
		this.school = school;
	    this.studentID = studentID;

	}
	public Student(String name, int age, String school, String studentID) {
		super(name, age); //상위클래스(Person)생성자 호출 구문
		this.school = school;
		this.studentID = studentID;
	}
	
	@Override //@:어노테이션, @Override --> 상위클래스 메소드를 하위클래스가 재정의 했다.
	public void introduce() {
		super.introduce(); //오버라이딩한 상위클래스 메소드 호출
	System.out.printf("안녕하세요. 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
	System.out.printf("학교는 %s이고, 학번은 %s입니다.\n", school, studentID);
	
	}
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	
	}

}