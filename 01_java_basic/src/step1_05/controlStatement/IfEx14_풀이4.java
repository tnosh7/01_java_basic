package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
/**
 * 24-05-10 
 * @author 윤성희
 * 랜덤 라이브러리 연습문제1
 */
public class IfEx14_풀이4 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int coin = ran.nextInt(2);
		System.out.println("=====동전 맞추기 게임=====");
		System.out.print("동전 앞면(0) 동전 뒷면(1) : ");
		int myAnswer = scan.nextInt();
		
		if(coin == myAnswer) System.out.println("정답!");
		if(coin != myAnswer) System.out.println("땡!");

	}

}
