package step1_06.loop;

import java.util.Scanner;

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


public class LoopEx05_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		int i = 1 ;
		 
		int bulgogiBurgerPriceCnt = 0;
		int shrimpBurgerPriceCnt  = 0;
		int colaPriceCnt = 0;
		while (i <=5 ) {
			System.out.println("주문하세요 :" );
			int menu = scan.nextInt();
			
			if (menu == 1) bulgogiBurgerPriceCnt++;
			else if (menu == 2) shrimpBurgerPriceCnt++;
			else if (menu == 3) colaPriceCnt++;

			i++ ;
		}
		int totalPrice = bulgogiBurgerPriceCnt*bulgogiBurgerPrice + shrimpBurgerPriceCnt*shrimpBurgerPrice + colaPriceCnt*colaPrice ;
	
		System.out.println("총금액 =" + totalPrice + " 원");
		System.out.println("현금입력 : ");
		int money = scan.nextInt();
		int change = money - totalPrice;
		
		if (change >= 0 ) {
			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "개");
			System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "개");
			System.out.println("3.콜         라 : " + colaPrice + "개");
			System.out.println("4.총금액 : " + totalPrice + " 원");
			System.out.println("5.잔돈 : " + change + " 원");
		}
		else {
			System.out.println("현금이 부족합니다.");
		}
	}

}
