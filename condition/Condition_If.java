package life_coding.condition;

public class Condition_If {

	public static void main(String[] args) {
		String name = args[0];
		String password = args[1];
		
		if (name.equals("yejeungJi") && password.equals("yejeungJi")) System.out.println("Hello yejeungJi!");
		else System.out.println("Who are you?");
	}
}
