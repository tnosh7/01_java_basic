package step1_03.operator;

// 23-04-24 16:23 ~
public class OperatorEx05_풀이 {

	public static void main(String[] args) {
		
		//예) 점수가 60점 이상이면
        int score = 30;
        System.out.println(score >= 60);
        
        
        //문제1) 배송비가 0원이면
       
        int q1 = 0;
        System.out.println(q1 == 0 );
        
        
        //문제2)  15가 3의 배수이면
        //힌트) 숫자를 3으로 나눈 나머지가 0이면 3의 배수
        int q2 = 15;
        System.out.println((q2 % 3 == 0));
        
        
        //문제3) 100이 짝수이면
        //힌트) 숫자를 2로 나눈 나머지가 0이면 짝수
        //      숫자를 2로 나눈 나머지가 1이면 홀수
        
        int q3 = 100;
        System.out.println(q3%2 == 0);

	}

}
