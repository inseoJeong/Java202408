package ex02;

public class Book {
	
					String title;  			//제목
					String author; 		//저자
					int page;     			//페이지 수

					
						Book() {  }         			//기본 생성자
						
						Book(String title, String author) {       //매개변수가 있는 생성자 book2
								this.title = title;
								this.author = author;
								
		}
			
						Book(String title, String author, int page){    //매개변수가 있는 생성자 book3
						this.title = title;
						this.author = author;
						this.page = page;
						
					//	page = this.page;      	  // 오류; 700에 초기값을 대입하기 때문에 0이 나옴.
						
		}
					
			void displayInfo() {
				System.out.println("title: " + this.title);
				System.out.println("author: " + author);
				System.out.println("page: " + page);
			}
}
			
			
			
	