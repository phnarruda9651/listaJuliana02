package aulaJuliana;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		//  Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor informado 
		// (para N) não seja maior que 0, deverá ser lido um novo valor para N.
		
		try (Scanner imput = new Scanner(System.in)){
			int n;
			
			do {System.out.println("digite um numero (inteiro) para o contador ir de 1 ate ele:");	
				n = imput.nextInt();
				
				if (n <= 0) {
					System.out.println("numero invalido digite novamente por favor");
				}
			}while (n <=0);
			
			for (int i = 1;i <= n;i ++) {
				System.out.println(i);
		}

	}

}
}
