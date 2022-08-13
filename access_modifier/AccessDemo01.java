package life_coding.access_modifier;

class Example01 {
	
	public String example01() {
		return "example01";
	}
	
	private String example02() {
		return "example02";
	}
	
	public String example03() {
		return this.example02();
	}
	
}

public class AccessDemo01 {

	public static void main(String[] args) {
		
		Example01 example01 = new Example01();
		
		System.out.println(example01.example01());
		System.out.println(example01.example03());
		
		// System.out.println(example01.example02()); 
		// 위 코드는 오류를 발생한다.

	}

}
