package questao11;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		
		String [] vetorNome = new String [3];
		Long [] vetorCPF = new Long[3];
		String[] vetorDataNascimento = new String[3];
		
		for (int i = 0; i < vetorCPF.length; i++) {
			System.out.println("Informe seu nome: ");
			vetorNome[i] = ler.nextLine();
			
			
		}
		
		Pessoa pessoa = new Pessoa();
		System.out.println("Informe seu nome: ");
		pessoa1.nome = ler.nextLine();
		System.out.println("Informe seu CPF: ");
		pessoa1.cpf = ler.nextLong();
		System.out.println("Informe sua data de nasicmento:");
		pessoa1.dataNascimento=ler.nextLine();
		System.out.println("");
		
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Informe seu nome: ");
		pessoa2.nome = ler.nextLine();
		System.out.println("Informe seu CPF: ");
		pessoa2.cpf = ler.nextLong();
		System.out.println("Informe sua data de nasicmento:");
		pessoa2.dataNascimento=ler.nextLine();
		System.out.println("");
		
		Pessoa pessoa3 = new Pessoa();
		System.out.println("Informe seu nome: ");
		pessoa3.nome = ler.nextLine();
		System.out.println("Informe seu CPF: ");
		pessoa3.cpf = ler.nextLong();
		System.out.println("Informe sua data de nasicmento:");
		pessoa3.dataNascimento=ler.nextLine();

	}

}
