package life_coding.object;

class Calculator02 {
	
	int num01, num02;
	
	public Calculator02() {
		this.num01 = 0;
		this.num02 = 0;
	}
	
	public Calculator02(int num01) {
		this.num01 = num01;
		this.num02 = 0;
	}

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
	
	public SubCalculator() {
		super();
	}
	
	public SubCalculator(int num01) {
		super(num01);
		this.num03 = 0;
	}
	
	public SubCalculator(int num01, int num02) {
		super(num01, num02);
		this.num03 = 0;
	}
	
	public SubCalculator(int num01, int num02, int num03) {
		super(num01, num02);
		this.num03 = num03;
	}

	public void sum() {
		System.out.println(this.num01 + this.num02 + this.num03);
	}
	
	public void avg() {
		System.out.println((this.num01 + this.num02 + this.num03) / 3);
	}

	public void substract() {
		System.out.println(this.num01 - this.num02 - this.num03);
	}

	public void multiply() {
		System.out.println(this.num01 * this.num02 * this.num03);
	}

}

public class ExtendsDemo {
	
	public static void main(String[] args) {
		SubCalculator calc01 = new SubCalculator();
		
		calc01.sum();
		calc01.avg();
		calc01.substract();
		calc01.multiply();
		
		SubCalculator calc02 = new SubCalculator(10);
		
		calc02.sum();
		calc02.avg();
		calc02.substract();
		calc02.multiply();
		
		SubCalculator calc03 = new SubCalculator(10, 20);
		
		calc03.sum();
		calc03.avg();
		calc03.substract();
		calc03.multiply();
		
		SubCalculator calc04 = new SubCalculator(10, 20, 30);
		
		calc04.sum();
		calc04.avg();
		calc04.substract();
		calc04.multiply();
	}
	
}