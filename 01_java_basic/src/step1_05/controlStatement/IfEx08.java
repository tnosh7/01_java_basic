package step1_05.controlStatement;

/*
 * 
 * # 중첩 if 문
 * 
 * 	- if문 안 명령어에 if문이 중첩으로 들어간 형태
 * 
 * */

public class IfEx08 {

	public static void main(String[] args) {
		
		int grade = 99;
		
		if (grade >= 60) {
			
			if (grade == 100) { // 들여쓰기 중요
				System.out.println("만점");
			}
			System.out.println("합격");
			
		}
		if (grade < 60) {
			System.out.println("불합격");
		}
		
	}

}
