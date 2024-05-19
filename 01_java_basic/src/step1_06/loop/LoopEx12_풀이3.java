package step1_06.loop;


/**
* 24-05-19
* while 369게임[2단계]
* @author 윤성희
*
*/
/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_풀이3 {

	public static void main(String[] args) {
		System.out.println("==== 369 게임 ====");
		int cnt = 0;
		int i   = 1;
		while(i < 51) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) cnt += 1 ; 
			if (i / 10 == 3) cnt += 1;
			
			if (cnt == 2) System.out.print(" 짝짝 ");
			else if (cnt == 1)System.out.print(" 짝 ");
			else System.out.print(i + " ");
			cnt = 0;
			i++;
		}
	
	
	
	}

}
