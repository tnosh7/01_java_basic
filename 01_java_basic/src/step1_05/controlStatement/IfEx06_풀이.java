package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


public class IfEx06_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("숫자1 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 : ");
		int num2 = scan.nextInt();
		
		int total = num1 * num2 ; 
		System.out.println(total);
		
		if (total % 3 == 0) System.out.println("정답");
		if (total % 3 != 0) System.out.println("땡");
		
		
		scan.close();
	
	}
	
	

}
