package ex01;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수 입력 >> ");
		
		int N = sc.nextInt();
		int sum = 0;
		
//		for(int i=1; i<=N; i += 2) {
		for(int i=1; i<=N; i++) {
			if( i% 2 == 1)
				sum += i;
		}
		
		System.out.println("N 홀수 합: " + sum);
		
	}

}
