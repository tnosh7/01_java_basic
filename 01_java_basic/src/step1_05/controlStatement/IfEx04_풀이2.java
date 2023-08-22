package step1_05.controlStatement;
//23-08-20 18:37 ~ 18:39
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


public class IfEx04_풀이2 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		int id = scan.nextInt();
		
		System.out.print("PW 입력 : ");
		int pw = scan.nextInt();
		
		if (dbId == id) {
			if (dbPw == pw) System.out.println("로그인 성공");
			else System.out.println("비밀번호 확인 바랍니다.");
		}
		else System.out.println("로그인 실패");
		

	}

}
