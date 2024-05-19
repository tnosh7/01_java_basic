package step1_06.loop;
/**
* 24-05-19
* while 소수찾기[1단계]
* @author 윤성희
*
*/
import java.util.Random;
/**
* 24-05-19
* while 테스트문제
* @author 윤성희
*
*/
import java.util.Scanner;

/*
 * # 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 */
public class LoopEx16_테스트문제풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 목적지(destination)
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		// 현재 위치
		int x = 0;
		int y = 0;
	
		// 방향(direction)
		int dir = 0;
		// 속도
		int speed = 0;
		// 요금
		int fee = 0;
		boolean isRun = true;
		int cnt = 0;
		/*
		 * 1) 방향설정 : 동(1)서(2)남(3)북(4) 
		 * 2) 속도설정 : 1~3까지만 가능 
		 * 3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동 
		 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다. 예) 1(50) 2(50) 3(100) 4(100) ...
		 */
		while (isRun) {
			System.out.println("= 택시 =");
			System.out.println("목적지 : " + desX + ", " + desY);
			System.out.println("현위치 : " + x + ", " + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("동(1)서(2)남(3)북(4) : ");
				dir = scan.nextInt();
			}
			else if (selectMenu == 2) {
				System.out.print("속도 설정(1~3) : " );
				speed = scan.nextInt();
			}
			else if (selectMenu == 3) {
				cnt += speed;
				if (dir == 1) {
					x += speed;
				}
				else if (dir == 2) {
					x -= speed;
				}
				else if (dir == 3) {
					y -= speed;
				}
				else if (dir == 4) {
					y += speed;
				}
				if (speed % 2 == 1) {
					cnt += 1;
				}
			}
			if (desX == x && desY == y) {
				fee = cnt / 2 * 50;
				System.out.println("======요금======");
				System.out.println(cnt + "번 이동\n" + fee + "원");
				break;
			}
		}

	}

}
