package step1_03.operator;

public class Test1 {

	public static void main(String[] args) {

			
			//예) 현금이 10000원있다. 2800원짜리 과자 구입 후, 잔돈 출력 
			System.out.println(10000 - 2800);
			System.out.println("잔돈 = " + (10000 - 2800) + "원");
			
			//문제1) 프리랜서의 세율은 3.3%이다. 월급이 2000000원일때 세금을 출력
			System.out.println(2000000 - (2000000 * 0.033));
			
			
			//문제2) 시험점수를 100, 88, 92점 을 받았다. 평균은?
			System.out.println((100 + 88 + 92) / 3.0);
			
			
			//문제3) 밑변이 3이고 높이가 7인 삼각형 넓이 출력 (삼각형의 넓이 구하는 공식 : 밑변 * 높이 / 2)
			System.out.println(3 * 7 / 2.0);
			
			//문제4) 100초를 1분 40초로 출력
			System.out.println(100 / 60 + "분 " + 100 % 60 + "초");
			
			//문제5) 800원에서 500원짜리 개수와 100원짜리 개수 출력
			//정답5) 500원 = 1개 
			//		100원 = 3개 

			System.out.println(800 / 500);
			System.out.println(800 % 500 / 100);
			System.out.println("500원 = " + (800 / 500) + "개");
			System.out.println("100원 = " + (800 % 500 / 100) + "개");
			
			
			//예) 점수가 60점 이상이면
	        int score = 30;
	        System.out.println(score >= 60);
	        
	        
	        //문제1) 배송비가 0원이면
	        
	        int q1 = 0;
	        System.out.println(q1 == 0 );
	        
	        
	        //문제2)  15가 3의 배수이면
	        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
	        int q2 = 15;
	        System.out.println(q2 % 3 == 0);
	        
	        
	        //문제3) 100이 짝수이면
	        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
	        //      숫자를 2로 나눈 나머지가 1이면 홀수
	        
	        int q3 = 100;
	        System.out.println(q3 % 2 == 0);
			// 예) 3의 배수이면서 짝수이면
			int num = 12;
			System.out.println(num % 3 == 0 && num % 2 == 0);
			
			
			// 문제 1) 3과목의 평균이 60점 이상이면 (단 어느 한 과목이라도 50점 미만이 아니어야한다.)
			int kor = 100;
			int eng = 87;
			int math = 41;
			int total = kor + eng + math;
			double avg = total / 3.0;
			System.out.println(avg >= 60 && kor > 50 && eng > 50 && math > 50);
			
			// 문제 2) 키가 150cm이상이고 몸무게가 30kg 이상이면
			int height = 149;
			int weight = 30;
			System.out.println(height >= 150 && weight >= 30);

		

	}

}
