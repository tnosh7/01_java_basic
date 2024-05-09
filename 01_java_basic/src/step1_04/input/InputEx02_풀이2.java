package step1_04.input;

import java.util.Scanner;

public class InputEx02_풀이2 {

	public static void main(String[] args) {
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자2개 입력");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("합 : " + (num1 + num2));
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("숫자 1개 입력 : ");
		int answer = scan.nextInt();
		System.out.println("홀수 : " + (answer % 2 == 1));
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		System.out.println("성적 60점 이상이고 100점 이하 : " + ( 59 < score && score <= 100));
	}
	
}
