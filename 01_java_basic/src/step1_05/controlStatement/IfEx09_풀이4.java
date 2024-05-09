package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */

/**
 * 24-05-10
 * @author 윤성희
 * 중첩if문 연습문제1
 */
public class IfEx09_풀이4 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		  System.out.print("키를 입력하세요 : ");
		  int myHeigth = scan.nextInt();
		  if(myHeigth >= 120) System.out.println("놀이기구를 이용할 수 있다.");
		  if(myHeigth < 120) {
			  System.out.print("부모님과 함께 오셨나요?(yes:1, no:0) : ");
			  int parentYn = scan.nextInt(); 
			  if (parentYn == 1) System.out.println("놀이기구를 이용할 수 있다.");
			  if (parentYn == 0) System.out.println("놀이기구를 이용할 수 없다.");
		  }
		  
		  scan.close();
	}

}
