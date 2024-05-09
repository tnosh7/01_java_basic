package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */
/**
 * 24-05-10 
 * @author 윤성희
 * 랜덤 라이브러리 연습문제2
 */

public class IfEx15_문제4 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ranNum = ran.nextInt(10);
		if (ranNum < 3) System.out.println("당첨!");
		if (ranNum >= 3) System.out.println("떙!");
		
		
		scan.close();
	}

}
