package step1_05.controlStatement;
//23-08-21 14:55 ~ 14:59
import java.util.Random;
import java.util.Scanner;

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

public class IfEx20_풀이2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int r = ran.nextInt(101) + 150;
		
		Scanner scan = new Scanner(System.in);
		
		int middle = (r / 10) % 10;
		System.out.println(r);
		System.out.print("가운데 숫자를 입력하세요 : ");
		int me = scan.nextInt();
		System.out.println(r + " : " + me);
		
		if (me == middle) System.out.println("정답");
		else System.out.println("꽝");
				
		
	}

}
