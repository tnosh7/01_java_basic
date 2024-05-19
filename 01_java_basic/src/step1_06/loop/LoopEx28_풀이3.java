package step1_06.loop;
/**
* 24-05-19
* 이중 for문 삼각형 그리기
* @author 윤성희
*
*/

// # 삼각형 그리기

public class LoopEx28_풀이3 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 - (i+1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = 3; j > i+1 ; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 -(i+1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i+i; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < 3 -(i+1); j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i+i; j--) {
				System.out.print("#");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}
