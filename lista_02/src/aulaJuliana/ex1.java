package aulaJuliana;

import java.util.Scanner;

public class ex1 {
	// Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo 
	//valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do 
	//primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).

	public static void main(String[] args) {
		try (Scanner imput = new Scanner(System.in)){
			 double valor1, valor2;

		        do {
		            System.out.println("digite o primeiro valor: ");
		            valor1 = imput.nextDouble();

		            System.out.println("digite o segundo valor (nao pode ser zero): ");
		            valor2 = imput.nextDouble();

		            if (valor2 == 0) {
		                System.out.println("O segundo valor nao pode ser zero. digite um valor diferente.");
		            }
		        } while (valor2 == 0);

		        double resultado = valor1 / valor2;
		        System.out.println("o resultado da divisao foi: " + resultado);
			
			// TAMBÉM COM RESOLUÇÃO DO EX 3
		}
		
		
	}

}
