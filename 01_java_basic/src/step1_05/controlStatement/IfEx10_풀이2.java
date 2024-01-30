package step1_05.controlStatement;

import java.util.Scanner;
//23-01-30 12:57 ~ 13:02
/*
 * # 로그인[3단계]
 * 
 * 1. id를 입력받아 dbId와 일치할 경우에만 pw를 입력할 수 있다.
 * 2. id가 틀린 경우, "id를 확인해주세요"라는 메세지를 출력한다.
 * 3. pw가 틀린 경우, "pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. id와 pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */



public class IfEx10_풀이2 {

	public static void main(String[] args) {
		
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력해주세요 : ");
		int id = scan.nextInt();
		if (id == dbId) {
			System.out.print("PW를 입력해주세요 : ");
			int pw = scan.nextInt();
			if(pw == dbPw) {
				System.out.println("로그인 성공");
			}
			else System.out.println("pw를 확인해주세요");
		}
		else System.out.println("id를 확인해주세요");
		
		
		
		
	}
	
}
