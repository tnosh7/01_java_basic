package step1_05.controlStatement;

import java.util.Scanner;
//23-08-20 19:10 ~ 19:15 
/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_풀이2 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		int myMenu = scan.nextInt();
		
		System.out.print("현금 입력 : ");
		int myCash = scan.nextInt();
		int cash = 0;
		if (myMenu == 1) cash = price1;
		else if (myMenu == 2) cash = price2;
		else if (myMenu == 3) cash = price3;

		if (myCash < cash) System.out.println("현금이 부족합니다.");
		else if (myCash >= cash) System.out.println("잔액 : " + (myCash - cash) + "원");
	}

}
