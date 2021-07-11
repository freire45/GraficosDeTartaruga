package br.com.erickfreire.graficotartaruga;

import java.util.Scanner;

/**
 * Programa em Java que simula gráfico de tartaruga
 * 
 * @author Erick Freire
 * @version 1 - Criado em 11-07-2021 as 14:20
 */

public class GraficosDeTartaruga {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int linha = 0;
		int coluna = 0;
		int linhaAtual;
		int colunaAtual;
		int opcao = 0;

		int[][] vetor = new int[20][20];

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				vetor[i][j] = 0;
			}
		}

		System.out.println("Programa que simula o gráfico de tartaruga: ");
		
		System.out.printf("Nos estamos na posicao: %d\n", vetor[0 + 1][0 + 1]);
		
		linhaAtual = 0;
		colunaAtual = 0;

		System.out.print("Digite 1 - Para adicionar uma posição ou 9 - Para sair");
		opcao = entrada.nextInt();

		while (opcao != 9) {

			System.out.print("Informe uma linha lembrando que o espaço é de 20: ");
			linha = entrada.nextInt();

			while (linha < 1 || linha > 20) {
				System.out.print("Erro: Informe uma linha lembrando que o espaço é de 20: ");
				linha = entrada.nextInt();
			}
			
			System.out.print("Informe uma coluna lembrando que o espaço é de 20: ");
			coluna = entrada.nextInt();
			
			while (coluna < 1 || coluna > 20) {
				System.out.print("Erro: Informe uma coluna lembrando que o espaço é de 20: ");
				coluna = entrada.nextInt();
			}
			
			if(linha < linhaAtual) {
				vetor[linha- 1][coluna- 1] = 1;
				System.out.printf("%d Acima\n", vetor[linha- 1][coluna- 1]);
			}
			
			if(linha > linhaAtual) {
				vetor[linha- 1][coluna- 1] = 2;
				System.out.printf("%d Abaixo\n", vetor[linha- 1][coluna- 1]);
			}
			
			if(linhaAtual == linha) {
				if(colunaAtual < coluna) {
					vetor[linha- 1][coluna- 1] = 3;
					System.out.printf("%d A direita\n", vetor[linha- 1][coluna- 1]);
				}
			}
			
			if(linhaAtual == linha) {
				if(colunaAtual > coluna) {
					vetor[linha- 1][coluna - 1] = 4;
					System.out.printf("%d A esquerda\n", vetor[linha- 1][coluna- 1]);
				}
			}
			
			if(linha == 10) {
				vetor[linha - 1][coluna - 1] = 5;
				System.out.printf("%d Ao Centro\n", vetor[linha- 1][coluna- 1]);
			}
			
			if(linha == 20) {
				vetor[linha - 1][coluna - 1] = 9;
				System.out.printf("%d No Final\n", vetor[linha- 1][coluna- 1]);
			}
			
			linhaAtual = linha;
			colunaAtual = coluna;
				
			
			

		}

	}

}
