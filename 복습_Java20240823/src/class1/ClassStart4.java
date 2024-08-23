// Student 타입을 사용하는 배열을 도입하면?

package class1;
public class ClassStart4 {
	public static void main(String[] args) {

		Student student1 = new Student(); //Student 클래스를 기반으로 새로운 객체를 생성하라는 뜻
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;
		
		Student student2 = new Student(); //Student 클래스를 기반으로 새로운 객체를 생성하라는 뜻
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

	//--------------------------------------------------------------------------------------------
		
		
		Student[] students = new Student[2];    //Student 변수를 2개 보관할 수 있는 사이즈 2의 배열 생성
		students[0] = student1;   //student1에는 참조값이 보관되어 있음
		students[1] = student2;
		
		System.out.println("이름:" + students[0].name + "나이:" + students[0].age +"성적:" + students[0].grade);
		System.out.println("이름:" + students[1].name + "나이:" + students[1].age +"성적:" + students[1].grade);
	
	}

}
