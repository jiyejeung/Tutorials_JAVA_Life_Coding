package life_coding.io;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InputDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		
//		System.out.println(i * 100);
		
//		sc.close();
//		=======
//		Scanner sc = new Scanner(System.in);
//		
//		while(sc.hasNextInt()) { // 숫자가 있으면, true 없으면, false
//			System.out.println(sc.nextInt() * 100);
//		}
//		
//		System.out.println("End!");
//		sc.close();
//		=======
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 100);
			}
			
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
