package step1_06.loop;
//23-08-21 16 :16 ~ 16:19
import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_풀이2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();		
		System.out.println("====구구단 게임====");
		int i = 0;
		int cnt = 0;
		while (i < 5) {
			int r1 = ran.nextInt(9) + 1;
			int r2 = ran.nextInt(9) + 1;
			int result = r1 * r2 ;
			System.out.print(r1 + " : " + r2 + " = ? ");
			int answer = scan.nextInt();
			if (result == answer) cnt++;
			i++;
		}
		System.out.println("성적 : " + (cnt * 20) + "점");

	}

}
