package step1_05.controlStatement;
//23-08-20 19:20 ~ 19:21
import java.util.Random;

/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_풀이2 {

	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(10)+ 1;
		System.out.println(r);
		if (r == 1 || r == 2 || r == 3) System.out.println("당첨");
		else System.out.println("꽝");
	}

}
