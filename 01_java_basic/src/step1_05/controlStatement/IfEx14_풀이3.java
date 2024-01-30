package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;
//23-01-30 14:06 ~ 14:07
/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_풀이3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("동전 앞면(0) 뒷면(1) : ");
		int answer = scan.nextInt();
		
		if(answer == coin ) System.out.println("정답");
		else System.out.println("오답");
	}

}
