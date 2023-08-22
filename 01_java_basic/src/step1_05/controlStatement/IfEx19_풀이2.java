package step1_05.controlStatement;

import java.util.Scanner;

//23-08-21 14:49 ~ 14:54
/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_풀이2 {

	public static void main(String[] args) {
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("계좌번호를 입력하세요 : ");
		int transferAcc = scan.nextInt();
		if (transferAcc == yourAcc) {
			System.out.print("이체할 금액을 입력하세요 : ");
			int transferMoney = scan.nextInt();
			
			if (transferMoney <= myMoney) {
				myMoney -= transferMoney;
				yourMoney += transferMoney;
				System.out.println("myMoney = " + myMoney + "원");
				System.out.println("yourMoney = " + yourMoney + "원");
			}
			else  System.out.println("이체불가");
		}
		else {
			System.out.println("계좌를 확인해주세요.");
		}
		
		
		
		
		
		
	}

}
