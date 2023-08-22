package step1_05.controlStatement;
//23-08-21 15:55 : 16:05
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
public class IfEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("==== 가위 바위 보 (하나빼기) ====");
		Random ran = new Random();
		int comLeft = ran.nextInt(3);
		int comRight = ran.nextInt(3);
		int comFinal = 0;
		int r = ran.nextInt(2);
		if (r == 0) comFinal = comLeft;
		else comFinal = comRight;
		
		System.out.print("가위(0) 바위(1) 보(2) 입력 : ");
		int meLeft = scan.nextInt();
		System.out.print("가위(0) 바위(1) 보(2) 입력 : ");
		int meRight = scan.nextInt();
		System.out.print("왼쪽(0) 오른쪽(1) 선택하세요 : ");
		int meFinal = scan.nextInt();
		
		if (meFinal == 0) meFinal = meLeft;
		else if (meFinal == 1) meFinal = meRight;
		
		System.out.println(comFinal + " : "  + meFinal);
		
		if (comFinal == 0 && meFinal == 1 || comFinal ==1 && meFinal ==2 || comFinal==2 && meFinal== 0 ) System.out.println("내가 이겼다!");
		else if (comFinal == 0 && meFinal == 2 || comFinal == 1 && meFinal == 0 || comFinal ==2 && meFinal ==1) System.out.println("내가 졌다!");
		else if (comFinal == meFinal)System.out.println("비겼다!");
		else System.out.println("잘못입력하셨습니다.");
	}
	

}
