package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. id와 pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 *    (db > database > 저장되어있는 데이터) 
 * 예) 로그인 성공 or 로그인 실패
 * 
 */


public class IfEx04_풀이 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in); 
		System.out.print( "Id 입력하세요 : ");
		int myId = scan.nextInt();
		System.out.print("Pw 입력하세요 : ");
		int myPw = scan.nextInt();
		
		
		if (dbId  == myId && dbPw == myPw ) System.out.println("로그인 성공");
		if (dbId != myId || dbPw != myPw ) System.out.println("로그인 실패");
		
		scan.close();
	}

}
