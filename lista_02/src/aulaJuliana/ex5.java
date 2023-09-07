package aulaJuliana;

import java.util.Scanner;

public class ex5 {

	// Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média 
	// (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
	
	public static void main(String[] args) {
		
		try (Scanner imput = new Scanner(System.in)){
			char resp;
			do {	
			double nota1, nota2;
			
			
			do {
				System.out.println("digite a primeira nota(de 0 a 10)");
				nota1 = imput.nextDouble();
				
				if(nota1 < 0 || nota1 > 10){
					System.out.println("numero invalido, tente novamente.");
				}
			}while (nota1 < 0 || nota1 > 10);
			
			do {
				System.out.println("digite a segunda nota(de 0 a 10)");
				nota2 = imput.nextDouble();
				
				if(nota1 < 0 || nota2 > 10){
					System.out.println("numero invalido, tente novamente.");
				}
			}while (nota1 < 0 || nota2 > 10);
			
			double notaf = (nota1 + nota2)/2;
			
			System.out.println("a media final e de: "+notaf);
			
			System.out.println("novo calculo??(s para sim)");
			resp = imput.next().charAt(0);
			
			}while (resp == 's' || resp == 'S');
			
			// TAMBEM RESPOSTA DA 6
		}
		}

	}


