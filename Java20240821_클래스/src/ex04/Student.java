package ex04;


public class Student {       // 클래스명 첫글자는 대문자,  변수 및 함수는 소문자

 
					private String name;
					private int age;
					private String phone;
					
					
					int getAge() {
						return age;
					}
					
					void setAge(int age) {
						this.age = age;
					}
					
					String getphone() {
						return phone;
					}
					
					void setPhone(String phone) {
						this.phone = phone;
					}
					
					
					//디폴트 생성자
					Student(){
						System.out.println("디폴트 생성자 호출");
					}
					Student(String name, int age, String phone) {
					this.name = name;
					this. age = age;
					this.phone = phone;

					}
					
					//read(읽기)  --> get + 변수명
					void nameInfo() {
						System.out.println("이름: " + name);
					}
					
					String getName(  ) {        //getter
						return name;
					}
					
					void setName(String name) {        //setter
						this.name = name;
					}
										
					//write(변경)  --> set + 변수명
					void nameChange(String name)  {
						this.name = name;
					}
					
					
					 void info()	 {
						System.out.printf("이름: %s, 나이: %d, 전화번호:%s\n",name, age, phone);
							   
				   }
				
					
					 
					 void 입실() {
					    System.out.println("입실하다.");
			 }
					 
					 void 퇴실() {
					     System.out.println("퇴실하다");
			 }
					 
					 void 조퇴() {
					    System.out.println("조퇴하다");
			 }
		}
