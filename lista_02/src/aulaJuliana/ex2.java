package aulaJuliana;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// Reescreva o exercício anterior utilizando a estrutura ENQUANTO.
		
		try (Scanner imput = new Scanner(System.in)){
			
			System.out.println("digite o primeiro valor: ");
			double valor1 = imput.nextDouble();
			
			System.out.println("agora o segundo valor");
			double valor2 = imput.nextDouble();
			
			while (valor2 == 0) {
				System.out.println("o segundo valor nao pode ser zero, digite outro valor: ");
				valor2 = imput.nextDouble();
			}
			
			double resultado = valor1 / valor2;
			System.out.print("o resultado da divisao foi: "+resultado);
			
			// TAMBÉM COM RESOLUÇÃO DO EX 4
		}

	}

}
