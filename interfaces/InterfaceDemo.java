package life_coding.interfaces;

interface Calculatable {

	public void set(int num01, int num02, int num03);
	public int sum();
	public int sub();
	public int multiply();
	public int avg();
	
}

class Calculator implements Calculatable {
	
	int num01, num02, num03;
	
	public void set(int num01, int num02, int num03) {
		this.num01 = num01;
		this.num02 = num02;
		this.num03 = num03;
	}
	
	public int sum() {
		return this.num01 + this.num02 + this.num03;
	}
	
	public int sub() {
		return this.num01 - this.num02 - this.num03;
	}
	
	public int multiply() {
		return this.num01 * this.num02 * this.num03;
	}
	
	public int avg() {
		return this.sum() / 3;
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.set(1, 2, 3);
		
		System.out.println(calc.sum());
	}
	
}
