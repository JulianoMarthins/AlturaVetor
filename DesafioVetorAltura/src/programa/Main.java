package programa;

import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas você quer inserir? ");
		int quant = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[quant];

		// Solicita ao usuário a entrada dos dados e armazena em uma nova pessoa.
		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.printf("\nDigite os dados da %d° pessoa\n", i + 1);

			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Pessoa(nome, altura, idade);
		}
		
		
		System.out.println();
		int cont = 0;
		double somaAltura = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdae() < 16) {
				cont++;
			}
			somaAltura += pessoa[i].getAltura();
		}
		
		System.out.printf("Altura média: %.2f", somaAltura / pessoa.length);
		System.out.println("\nMédia de menores de idade: " + (cont * 100 / pessoa.length) + "%");
				
		System.out.println("\nPessoas menores de idade: ");
		for(Pessoa pes: pessoa) {
			if(pes.getIdae() < 16) {
				System.out.println(pes.getNome());
			}
		}
		/*
		 * Mostrar na tela altura média das pessoas Motrar na tela a porcentagem de
		 * menor de 18 anos
		 */

		sc.close();
	}

}
