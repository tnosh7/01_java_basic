package step1_05.controlStatement;

//23-04-25 16:10 ~ 16~28
import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. Scanner로 숫자를 입력받아 me 변수에 저장한다음 아래와 같은 기능을 구현한다.
 * 1) me가 com보다 작으면  Up! 출력 
 * 2) me와 com이 같으면 Bingo! 출력
 * 3) me가 com보다 크면 Down! 출력
 */


public class IfEx02_풀이 {

	public static void main(String[] args) {
	
		int com = 8;	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int getMe = scan.nextInt(); 
		
		 if (getMe < com) {
			 System.out.println("up!");
		 }
		 if (getMe == com) {
			 System.out.println("Bingo!");
		 }
		 if (getMe > com) {
			 System.out.println("Down!");
		 }
		 scan.close();
	}
	
	

}
