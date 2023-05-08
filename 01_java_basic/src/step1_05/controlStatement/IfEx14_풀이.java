package step1_05.controlStatement;
//23-04-26 15:29 ~
import java.util.Random;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.println(coin);
		if (coin == 1) {
			System.out.println("동전 뒷면");
		}
		if (coin == 0) { 
			System.out.println("동전 앞면");
		}
		

	}

}
