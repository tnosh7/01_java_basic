package step1_05.controlStatement;

import java.util.Scanner;

//23-08-20 19:18 ~ 19: 20
/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_풀이2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 =scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int num2 =scan.nextInt();
		
		System.out.print("숫자3 입력 : ");
		int num3 =scan.nextInt();
		
		
		if (num1 > num2 && num1 > num3) System.out.println("가장 큰 수 : " + num1);
		else if (num2 > num1 && num2 > num3) System.out.println("가장 큰 수 : " + num2);
		else if (num3 > num2 && num3 > num1) System.out.println("가장 큰 수 : " + num3);
		
	}

}
