package life_coding.object;

class Calculator01 {

	static double PI = 3.141592;
	static int base = 0;
	int num01 = 0;
	int num02 = 0;

	public void set(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}

	public void sum() {
		System.out.println(this.num01 + this.num02 + base);
	}

	public void avg() {
		System.out.println((this.num01 + this.num02 + base) / 2);
	}
	
	public void example() {
		sum();
	}
	
	public static void example02() {
		System.out.println(PI);
	}

}

public class ClassDemo {

	public static void main(String[] args) {
		
		Calculator01 calc01 = new Calculator01();
		Calculator01 calc02 = new Calculator01();

		calc01.set(10, 20);
		calc02.set(20, 30);

		calc01.sum(); // 30
		calc02.sum(); // 50

		calc01.avg(); // 15
		calc02.avg(); // 25

		System.out.println(calc01.PI); // 3.141592
		System.out.println(calc02.PI); // 3.141592
		System.out.println(Calculator01.PI); // 3.141592

		Calculator01.base = 10;

		calc01.sum(); // 40
		calc02.sum(); // 60

		calc01.avg(); // 20
		calc02.avg(); // 30

		calc01.example();
		calc01.example02();
		calc02.example02();
		Calculator01.example02();
	}

}