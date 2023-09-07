package aulaJuliana;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner imput = new Scanner(System.in)){
		System.out.println("digite o numero (inteiro) que deseja ter a tabuada de 0 a 10");
		int mult = imput.nextInt();
		
		
		for (int i = 1;i <= 10;i ++) {
			System.out.println(mult+"x"+i+"="+mult*i);
	}
}
}
}
