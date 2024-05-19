package step1_06.loop;
/**
* 24-05-19
* for 문제 풀이
* @author 윤성희
*
*/
public class LoopEx20_풀이2 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1 2 3 4 5
		for (int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5 6 7 8 9
		for (int i = 1; i < 11; i++) {
			if (4 < i && i < 10) System.out.print(i + " ");
 		}
		System.out.println();
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6 5 4 3
		for (int i = 10; i > 0; i--) {
			if (3 <= i && i <= 6) System.out.print(i + " ");
		}
		System.out.println();
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1 2 7 8 9 10
		for (int i = 1; i <= 10; i++) {
			if (3 > i || i >= 7 )
				System.out.print(i + " ");
		}
		
	}

}
