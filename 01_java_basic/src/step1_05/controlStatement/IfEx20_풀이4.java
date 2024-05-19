package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 24-05-18
 * if문 가운데 숫자 맞추기 게임 : 이체하기
 * @author 윤성희
 *
 */
/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_풀이4 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ranNum = ran.nextInt(101) + 150;
		System.out.println(ranNum);
		
		System.out.print("랜덤 숫자의 가운데 숫자를 맞추세요(150~250) : ");
		int myAnswer = scan.nextInt();
		int answer = (ranNum / 10 ) % 10; 
		
		if (myAnswer == answer ) System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		
		scan.close();
	
	
	}

}
