package step1_03.operator;

// 2023-04-24 15:37 ~ 16:00  
public class OperatorEx03_풀이 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(10000 - 2800);
		System.out.println("잔돈 = " + (10000 - 2800) + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		System.out.println("세금 = " + (2000000 * 0.033) + "원");
		System.out.println();
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		System.out.println((100 + 88 + 92) / 3.0 );
		System.out.println("평균은 " + (100 + 88 + 92) / 3.0 + "입니다.");
		System.out.println();
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		System.out.println((3*7) / 2.0);
		System.out.println("삼각형의 넒이는 "+ (3*7) / 2.0 + "입니다.");
		System.out.println();
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println(100 / 60);
		System.out.println(100 % 60);
		System.out.println(100 / 60 + "분 " + 100 % 60 + "초");
		System.out.println();
		
		//문제5) 800원에서 500원짜리 개수와 100원짜리 개수 출력
		//정답5) 500원 = 1개 
		//		100원 = 3개 
		System.out.println(800 / 500 + "개");
		System.out.println(300 / 100 + "개");
		System.out.println(800 % 500 / 100);
		System.out.println("500원 " + 800 / 500 + "개 " + "100원 " + 800 % 500 / 100 + "개");
		
	}

}
