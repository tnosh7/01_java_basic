package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */
/**
 * 24-05-10
 * @author 윤성희
 * if연습문제6
 */
public class IfEx07_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요(0~100) : ");
		int myScore = scan.nextInt();
		
		if(60 <= myScore && myScore <= 100) System.out.println("합격");
		if(0 <= myScore && myScore < 60) System.out.println("불합격");
		if(100 < myScore || myScore < 0) System.out.println("성적을 잘못 입력했습니다.");
		
		scan.close();
	}

}
