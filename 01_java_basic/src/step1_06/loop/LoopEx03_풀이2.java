package step1_06.loop;
//23-08-21 16 : 13 ~ 16 :15
//# 반복문 기본문제[2단계]

public class LoopEx03_풀이2 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		int i = 1 ;
		while (i < 11) {
			if (3 > i || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		i = 1;
		int result = 0;
		while (i < 11) {
			if (3 > i || i >= 7) {
				result += i;
			}
			i++;
		}
		System.out.println(result);
		
		
		// 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
		i = 1;
		int cnt = 0;
		while (i <11 ) { 
			if (3> i || i >= 7) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
		i = 1;
		result = 0;
		while (i < 6 ) {
			result += i;
			i++;
		}
		System.out.println(result);
	}

}
