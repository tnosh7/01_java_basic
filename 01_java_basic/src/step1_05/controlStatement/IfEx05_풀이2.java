package step1_05.controlStatement;
//23-08-20 18:40 ~ 18:41
import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_풀이2 {

	public static void main(String[] args) {
		
		int dbId = 0;
		int dbPw = 0;
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("====회원가입====");
		System.out.print("ID를 입력하세요.");
		dbId = scan.nextInt();
		
		System.out.print("PW를 입력하세요.");
		dbPw = scan.nextInt();
		
		System.out.println("====로그인====");
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
