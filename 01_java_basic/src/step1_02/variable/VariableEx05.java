package step1_02.variable;



/*
 * 
 *  # 상수 ( constant ) 
 * 
 *  - 값이 변하지 않는 데이터
 *  - final 키워드를 사용하여 만든다.
 * 	- 변경되면 안되는 데이터의 보호를 위해 사용한다.
 *  - 특정데이터를 의미있는 문자로 사용하여 인식하기 쉽게 한다. 
 * 	
 * 
 * */

public class VariableEx05 {

	public static void main(String[] args) {
		
		// 변수 
		int orderQty = 1;
		orderQty = 3; // 수정 가능
		System.out.println(orderQty);
		System.out.println();
		
		// 상수 
		final String FILE_REPOSITORY_PATH = "c:\\fileRepo";		// 상수는 대문자
		//FILE_REPOSITORY_PATH = "D:\\";						// 수정 불가
		
		System.out.println(FILE_REPOSITORY_PATH);
		System.out.println();
		
		final int CHARACTER = 1;
		final int BALL = 9;
		final int GOAL = 7;

//		수정 불가		
//		CHARACTER =2 ;
//		BALL = 2;
//		GOAL = 2;
		
	}
}
