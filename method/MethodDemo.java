package life_coding.method;

public class MethodDemo {
	
	public static int numbering(int init, int limit) {
		int output = 0;
		
		for (int i = init; i < limit; i++) {
			System.out.println(i);
			output++;
		}
		
		return output;
	}

	public static void main(String[] args) {
		System.out.println(numbering(0, 5));
	}

}
