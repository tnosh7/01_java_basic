package step1_06.loop;

import java.util.Scanner;

/**
* 24-05-19
* while 베스킨라빈스31
* @author 윤성희
*
*/


/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 1;
		
		System.out.println("====베스킨라빈스 31====");
		while (true) {
			
			if (turn % 2 == 1) { 
				System.out.print("p1 입력 : ");
				p1 = scan.nextInt();
				br += p1;
				System.out.println(turn + "턴 : p1(" + p1 + ")\tbr(" + br + ")");
			}
			else if (turn % 2 == 0) {
				System.out.print("p2 입력 : ");
				p2 = scan.nextInt();
				br += p2;
				System.out.println(turn + "턴 : p2(" + p2 + ")\tbr(" + br + ")");
			}
			if (br >= 31) {
				break;
			}
			turn++;
		}
		if (turn % 2 == 0) System.out.println("승리자는 p1");
		else System.out.println("승리자는 p2");
	}

}
