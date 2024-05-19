package step1_05.controlStatement;
/**
 * 24-05-18
 * 가위 바위 보 (하나빼기) 계산: 이체하기
 * @author 윤성희
 *
 */
import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx28_테스트풀이1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("==== 가위 바위 보 (하나빼기) ====");
		Random ran = new Random();
		int comRight = ran.nextInt(3); 
		int comLeft = ran.nextInt(3);
		
		
		System.out.println("=======가위(0) 바위(1) 보(2)=======");
		System.out.print("오른손 입력 :");
		int meRight = scan.nextInt();
		System.out.print("왼손 입력 :");
		int meLeft = scan.nextInt();
			
		System.out.println("컴퓨터 : 오른손 (" + comRight + ") 왼손 (" + comLeft + ")");
		System.out.println("나 : 오른손 (" + meRight + ") 왼손 ("  + meLeft + ")");
		System.out.print("하나 고르기\n오른손(0) 왼손(1) :");
		int meChoose = scan.nextInt();
		int meFinal = 0;
		if (meChoose == 0) meFinal = meRight;
		else if(meChoose == 1) meFinal = meLeft;
		else System.out.println("잘못입력했습니다.");
		
		int comFinal = 0;
		int comChoose = ran.nextInt(2);
		if (comChoose == 0) comFinal = comRight;
		else  comFinal = comLeft;
		
		System.out.println("=======하나 빼기=======");
		System.out.println("com : " + comFinal + "\nme : " + meFinal);
		if (comFinal == 0) {
			if (meFinal == 1) System.out.println("내가 이겼다");
			else if (meFinal == 2) System.out.println("내가 졌다");
		}
		else if (comFinal == 1) {
			if (meFinal == 2) System.out.println("내가 이겼다");
			else if (meFinal == 0) System.out.println("내가 졌다");
		}
		else if (comFinal == 2) {
			if (meFinal == 0) System.out.println("내가 이겼다");
			else if (meFinal == 1) System.out.println("내가 졌다");
		}
		else if (comFinal == meFinal) System.out.println("비겼습니다.");
	}
	

}
