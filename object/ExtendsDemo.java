package life_coding.object;

class Calculator02 {
	
	int num01, num02;

	public Calculator02(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	
	public void sum() {
		System.out.println(this.num01 + this.num02);
	}

	public void avg() {
		System.out.println((this.num01 + this.num02) / 2);
	}

}

class SubCalculator extends Calculator02 {
	
	int num03;
	
	public SubCalculator(int num01, int num02, int num03) {
		super(num01, num02);
		this.num03 = num03;
	}

	public void substract() {
		System.out.println(this.num01 - this.num02);
	}

	public void multiply() {
		System.out.println(this.num01 * this.num02 * this.num03);
	}

}

public class ExtendsDemo {
	
	public static void main(String[] args) {
		SubCalculator calc = new SubCalculator(10, 20, 30);
		
		calc.sum();
		calc.avg();
		calc.substract();
		calc.multiply();
	}
	
}