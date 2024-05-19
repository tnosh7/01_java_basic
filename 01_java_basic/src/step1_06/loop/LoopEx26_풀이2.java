package step1_06.loop;

/**
* 24-05-19
* for 369게임[2단계]
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

public class LoopEx26_풀이2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i++) {
			int cnt = 0;
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)cnt++;
			if (i / 10 == 3) cnt++;
			
			if(cnt==2) System.out.print(" 짝짝 ");
			else if (cnt ==1) System.out.print(" 짝 ");
			else System.out.print(i + " ");
		}
		
	}

}
