package step1_02.variable;

// 2023-04-24 
public class VariableEx03_풀이 {

	public static void main(String[] args) {
		
		//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력
		
		int cash = 10000;
		int snack = 2800;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
		int salary = 2000000; 
		double tax = 0.033; 
		System.out.println("세금은 " + salary * tax + "입니다." );
		System.out.println();
		
		//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
		int score1 = 100 ;
		int score2 = 88 ;
		int score3 = 92 ; 
		System.out.println("평균은 " + (score1 + score2 + score3) / 3 + "입니다.");
		System.out.println();		
		
		//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
		int height = 7;
		int width = 3;
		int triArea = height * width / 2 ;
		System.out.println(triArea + "입니다.");
		System.out.println();
		
		//문제4) 100초를 1분 40초로 출력
		
		
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원의 개수 = 1개
		//       100원의 개수 = 3개 


	}

}
