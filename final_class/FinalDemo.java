package life_coding.final_class;

class Final01 {
	
	int num01 = 3;
	static final double PI = 3.14;
	
	void example(){
		Final02.PI = 5.6;
		// 자신의 클래스 내에서의 값 변경은 가능하다.
		System.out.println(Final02.PI);
	}
	
}

class FinalClass01 extends Final01 {
	
	void example01() {
		System.out.println(this.num01);
		System.out.println(Final01.PI);
		this.num01 = 5;
		// Final01.PI = 3;
		// 사용 불가
	}
	
}

class Final02 {
	
	final int num01 = 1;
	static double PI = 3.14;
	
	static final void example(){
		Final02.PI = 5;
		System.out.println(Final02.PI);
	}
	
	static final void example(int num01){
		Final02.PI = 5;
		System.out.println(Final02.PI);
	}
	
}

class FinalClass02 extends Final02 {
	
//	static final void example() {}
//	 사용 불가
	
	void example02() {
//		this.num01 = 3;
//		사용 불가
		Final02.PI = 3;
	}
	
}

final class Final03 {
	int num01 = 3;
	
	final void example() {
		System.out.println("Hello");
	}
}


//public class FinalDemo extends Final03 {
//
//	public static void main(String[] args) {}
//
//}

public class FinalDemo {

	public static void main(String[] args) {}

}
