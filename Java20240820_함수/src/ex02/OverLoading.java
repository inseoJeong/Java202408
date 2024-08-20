package ex02;

public class OverLoading {

	public static void main(String[] args) {
	
	/*
	 * 오버라이딩(Overriding) --> 상속
	 * 오버로딩(OverLoading) : 매개변수가 다른 같은이름 함수	
	 */
		
		func();
		func(5);
		func(10,20);
		func("abc");
		
	}
	
		static void func() {}
		static void func(int i) {}
		static void func(int i, int j) {}
		static void func(String s) {}
		
		
	
	
	
  }
