package step1_06.loop;


// # 삼각형 그리기

public class LoopEx28_풀이2 {
	
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
		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
	
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		System.out.println();
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
			for (int j = i; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = 2; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
