package step1_06.loop;

import java.util.Scanner;

/**
 * 24-05-19
 * while 영수증 출력[2단계]
 * @author 윤성희
 *
 */
/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		int bulCnt  = 0;
		int shiCnt  = 0;
		int colaCnt = 0;
		int i = 0;
		while (i < 5) {
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			if (menu == 1) bulCnt++;
			else if (menu == 2) shiCnt++;
			else if (menu == 3) colaCnt++;
			i++;
		}
		int bulSum  = bulCnt  * bulgogiBurgerPrice;
		int shiSum  = shiCnt  * shrimpBurgerPrice;
		int colaSum = colaCnt * colaPrice;
		int total   = bulSum + shiSum + colaSum;
		System.out.println("=====롯데리아 영수증=====");
		System.out.println("1.불고기 버거 : "  + bulSum   + "원");
		System.out.println("2.새우    버거 : "  + shiSum  + "원");
		System.out.println("3.콜         라 : " + colaSum + "원");
		System.out.println("4.총   금   액 : "  + total   + "원");
		System.out.print("금액을 입력하세요 : ");
		int myMoney = scan.nextInt();
		if (total > myMoney) System.out.println("금액이 부족합니다.");
		else {
			myMoney -= total;
			System.out.println("5.잔         돈 :" + myMoney + "원");
		}
		
	}

}
