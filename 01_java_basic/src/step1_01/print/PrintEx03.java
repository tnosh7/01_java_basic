package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintEx03 {

	public static void main(String[] args) {

		/*
		 * 
		 *  # 이스케이프 문자 ( escape sequence ) 
		 * 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \\ : 문자 자체 " (문법x)
		 *  4) \" : 문자 자체 " (문법x)
		 * 
		 */
		
		System.out.println("1)로그인\n2)로그아웃\n3)공지사항");
		System.out.println("1)로그인\t 2)로그아웃\t 3)공지사항");
		System.out.println("C:\\counpang\\img_file_repo");
		System.out.println("\"안녕하세요\"");
		System.out.println("\n===============================\n");
		 /* 
		 *  서식 문자 출력
		 *  
		 *  1) %d : 정수
		 *  2) %f : 실수 (소수점6자리까지 출력)
		 *  3) %c : 단일 문자
		 *  4) %s : 문자열
		 *  
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
		System.out.printf("%d\n", 10);				///프린트f 문자만 출력 .
		System.out.printf("%f\n", 3.14); 
		System.out.printf("%.1f\n", 3.14); 
		System.out.printf("%.2f\n", 3.14); 
		System.out.printf("%.3f\n", 3.14); 
		
		System.out.printf("%c\n", '#');
		System.out.printf("%s\n", "글자");
		System.out.printf("총점 : %d, 평균 : %.1f\n", 300, 300 / 3.0); 
		System.out.printf("이름 : %s, 나이 : %d, 총점 : %d, 평균 : %.1f\n", "데니스리치" , 50, 400, 400.0 / 4);
		System.out.println("\n===============================\n");
		/*
		 * 
		 *  # 시간 (Timestamp)
		 *  
		 *  1) new Date()
		 *  
		 *   - 현재시간 정보를  생성한다.
		 *   
		 *  	java.util.Date > 날짜 + 시간
		 *  	java.sql.Date  > 날짜
		 *  
		 *  
		 *  2) System.currentTimeMillis()
		 *   
		 * 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		 *   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long으로 저장한다.
		 *   
		 *   
		 *   
		 *  # 시간 출력 형식 SimpleDateFormat
		 *   
		 *   - 날짜 및 시간 출력 서식 지정 방법은 SimpleDateFormat 객체를 사용하여 구현한다.
		 *  - SimpleDateFormat 변수명 = new SimpleDateFormat("날짜 및 시간 서식"); 형태로 객체를 생성한다.
		 *   - sdf.format(date); 메서드를 사용하여 날짜 표현식을 지정한다.
		 *   - 상세 서식은 구글에서 "simpledateformat 형식"을 검색하여 사용한다.
		 *   - 중요)날짜타입 데이터에서 글자타입으로 데이터의 형이 변환된다. 
		 *   
		 */
		
		Date time1 = new Date();
		System.out.println(time1);	// Wed May 10 15:39:31 KST 2023
		
		long time2 = System.currentTimeMillis();
		System.out.println(time2);  // 1683701129491 
		System.out.println();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd"); 	 // import java.text.SimpleDateFormat;
		String date1 = sdf1.format(time1);
		String date2 = sdf1.format(time2);
		System.out.println("date1 : " +date1);
		System.out.println("date2 : " +date2);
		System.out.println();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String date3 = sdf2.format(time1);
		String date4 = sdf2.format(time2);
		System.out.println("date3 : " +date3);
		System.out.println("date4 : " +date4);
		System.out.println();

		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		String date5 = sdf3.format(time1);
		String date6 = sdf3.format(time2);
		System.out.println("date5 : " +date5);
		System.out.println("date6 : " +date6);
		System.out.println();
		
		
		
		
		
		
		
		/*
		 * # 숫자 형식
		 * 
		 * 1) DecimalFormat df = new DecimalFormat("숫자 서식");
		 *  - 숫자 서식은  "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여주어 표현한다.
		 *  - .format(숫자데이터); 메서드를 사용하여 숫자 출력형식을 지정한다.
		 *  - 상세 서식은 구글에서 "DecimalFormat 형식"을 검색하여 사용한다.
		 *  - 중요)숫자 타입에서 글자타입으로 데이터의 형이 변환된다.
		 *  
		 * */  
		
		int price1 =10000;
		int price2 =100000;
		int price3 =1000000;
		
		DecimalFormat df = new DecimalFormat("#,##0");
		String number1 = df.format(price1);
		
		System.out.println("number1 : " + number1);
		System.out.println("number2 : $" + df.format(price2));
		System.out.println("number3 : " + df.format(price3) + "원");
		
	}

}
