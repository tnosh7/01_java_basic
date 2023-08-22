package step1_06.loop;

import java.util.Scanner;

//23-08-21 16:20 ~ 16:27;
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


public class LoopEx05_풀이2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		int i = 0;
		int bulgogiCnt = 0;
		int shrimpCnt = 0;
		int colaCnt = 0;
		
		while (i < 5) {
			System.out.print("메뉴선택 : ");
			int order = scan.nextInt();
			if (order == 1) bulgogiCnt++;
			else if (order ==2) shrimpCnt++;
			else if (order == 3) colaCnt++;
			i++;
		}
		int totalPrice = (bulgogiBurgerPrice * bulgogiCnt) + (shrimpBurgerPrice * shrimpCnt) + (colaPrice * colaCnt);
		System.out.println("===롯데리아 영수증===");
		System.out.println("1. 불고기 버거 : " + bulgogiCnt + "개");
		System.out.println("2. 불고기 버거 : " + shrimpCnt + "개");
		System.out.println("3. 불고기 버거 : " + colaCnt + "개");
		
		System.out.println("4. 총   금  액 : " + totalPrice + "원");
		System.out.print("현금 입력 : ");
		int myCash = scan.nextInt();
		if (myCash >= totalPrice) {
			myCash -= totalPrice;
			System.out.println("5. 잔 돈 : " + myCash + "원");
		}
		else System.out.println("금액이 부족합니다.");
	}

}
