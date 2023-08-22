package step1_05.controlStatement;
//23-08-20 19:04 ~ 19:07 
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


public class IfEx09_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("키 입력 : ");
		int height = scan.nextInt();
		
		if (height >= 120) System.out.println("놀이기구 이용가능");
		else if (height < 120) {
			System.out.print("부모님과 함께 오셨나요?(yes:1, no:0) : ");
			int parent = scan.nextInt();
			if (parent == 1) System.out.println("놀이기구 이용가능");
			else System.out.println("놀이기구 이용불가");
		}
		else System.out.println("놀이기구 이용불가");
	 }

}
