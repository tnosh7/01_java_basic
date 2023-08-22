package step1_05.controlStatement;
//23-08-21 15:00 ~ 15:07
import java.util.Random;
import java.util.Scanner;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_풀이2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int r = ran.nextInt(50) +1;
		
		int r10 = r /10; 
		int r1 = r % 10;
		
		int cnt = 0 ;
		
		if(r10 == 3 || r10 == 6 || r10 == 9) cnt += 1;
		if(r1 == 3 || r1 == 6 || r1 == 9) cnt += 1;
		
		if (cnt == 2) System.out.println(r + " : 짝짝" );
		else if (cnt == 1) System.out.println(r + " : 짝" );
		else System.out.println(r + " : " + r);
		
		
		
		
	
	
	}
	

}
