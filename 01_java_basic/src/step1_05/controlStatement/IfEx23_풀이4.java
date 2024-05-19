package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 24-05-18
 * if문 연산자 기호 맞추기 게임: 이체하기
 * @author 윤성희
 *
 */
/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_풀이4 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ranNum1 = ran.nextInt(10) + 1;
		int ranNum2 = ran.nextInt(10) + 1;
		int oper = ran.nextInt(4) + 1;
		int answer = 0;
		if (oper == 1)  answer = ranNum1 + ranNum2;
		else if (oper == 2)answer = ranNum1 - ranNum2;
		else if (oper == 3)answer = ranNum1 * ranNum2;
		else answer = ranNum1 % ranNum2;
		
		System.out.println("연산자 기호 맞추기 게임\n 1) + 2) - 3) * 4) % ");
		System.out.println(ranNum1 + " ? " + ranNum2 + " = " + answer);
		System.out.print("번호를 선택하세요 : ");
		int myAnswer = scan.nextInt();
		
		if (oper == myAnswer)System.out.println("정답입니다.");
		else System.out.println("오답입니다.");
		scan.close();
		
		
	}

}
