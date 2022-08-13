package life_coding.abstractClass;

abstract class Example01 {
	
	public abstract int example01();
	// public abstract int example01() {...} 은 에러를 발생시킨다.
	// 오버라이딩을 필수로 하게 만든다.
	
	public void example02() {
		System.out.println("Hello World");
	}
	
}

class Example02 extends Example01 {
	
	public int example01() {
		return 27;
	}
	// 오버라이딩을 abstract class 안에 abstract 메소드가 존재하는 경우
	// 반드시 오버라이딩을 해주어야한다.
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Example02 example02 = new Example02();
		
		System.out.println(example02.example01());
		example02.example02();
	}

}
