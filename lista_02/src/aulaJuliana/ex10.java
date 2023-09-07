package aulaJuliana;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// 10) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N 
		// será sempre maior que ZERO.

		try (Scanner imput = new Scanner(System.in)){
			
		System.out.println("digite um numero (inteiro) para o contador ir de 1 ate ele:");	
			int n = imput.nextInt();
			
			for (int i = 1;i <= n;i ++) {
				System.out.println(i);
			}
		}
		
	}

}
