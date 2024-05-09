package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */
/**
 * 24-05-10
 * @author 윤성희
 * 중첩if문 연습문제3
 */


public class IfEx11_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		System.out.print("메뉴를 입력하세요 : ");
		int myOrder = scan.nextInt();
		System.out.print("메뉴를 입력하세요 : ");
		int myCash= scan.nextInt();
		
		int charge = 0;
		if (myOrder == 1) charge = myCash - price1;
		if (myOrder == 2) charge = myCash - price2;
		if (myOrder == 3) charge = myCash - price3;
		if (charge >= 0) System.out.println("잔돈: " + charge + "원");
		if (charge < 0) System.out.println("현금이 부족합니다.");
		
		scan.close();
	}

}
