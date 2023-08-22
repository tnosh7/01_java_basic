package step1_06.loop;


//23-08-21 16:27 ~ 16:28;
import java.util.Scanner;

/*
 * # 반복문 종료(-100)
 * 
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 * 예)
 * 숫자 입력[EXIT:-100] : 1
 * 숫자 입력[EXIT:-100] : 3
 * 숫자 입력[EXIT:-100] : 4
 * 숫자 입력[EXIT:-100] : -100
 * 프로그램 종료
 * 
 */

public class LoopEx06_풀이2 {

	public static void main(String[] args) {
		
		/*
			boolean isRunning = true;
			
			while (isRunning == true) {  
				
				if (종료를 원하는 시점) {
					isRunning = false;
				}
				
			}
		*/
		Scanner scan = new Scanner(System.in);
				
		boolean isRunning = true;
		while (isRunning) {
			System.out.print("숫자 입력[EXIT:-100] : ");
			int number = scan.nextInt();
			if (number == -100) isRunning = false;
		}
		System.out.println("프로그램 종료");
		
		

	}

}
