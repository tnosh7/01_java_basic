package step1_02.variable;

// 변수의 생명주기(Life Cycle , Scope)

public class VariableEx04 {

	public static void main(String[] args) {

		int x = 10;
		
		if (true) {
			int y = 7;
			System.out.println(x);
			System.out.println(y);
			//System.out.println(z);  // error
		}
		
		if (true) {
			int z = 3;
			System.out.println(x);
			//System.out.println(y); // error
			System.out.println(z);
		}
		
		System.out.println(x);
		//System.out.println(y); // error
		//System.out.println(z); // error
		
	}

}
