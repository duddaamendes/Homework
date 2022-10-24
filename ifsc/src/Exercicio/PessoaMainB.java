package Exercicio;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String [] vetorNome = new String [3];
		Long [] vetorCPF = new Long[3];
		String[] vetorDataNascimento = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Informe sua data de nascimento:");
			vetorDataNascimento[i] = ler.nextLine();
			System.out.println("Informe seu nome: ");
			vetorNome[i] = ler.nextLine();
			System.out.println("Informe seu CPF:");
			vetorCPF[i]=ler.nextLong();
			}
		
		for (int j = 0; j < 3; j++) {
			System.out.println(vetorNome[j]);
			System.out.println(vetorCPF[j]);
			System.out.println(vetorDataNascimento[j]);
		}
	}

}
