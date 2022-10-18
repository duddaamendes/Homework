package questao11;

public class PessoaMainA {

	public static void main(String[] args) {
		Pessoa maria = new Pessoa();
		maria.nome = ("Maria");
		maria.cpf = 92765482l;
		maria.dataNascimento = ("27/10/2005");
		
		Pessoa bruna = new Pessoa();
		bruna.nome = ("Bruna");
		bruna.cpf = 92765482l;
		bruna.dataNascimento = ("27/10/2005");
		
		Pessoa sofia = new Pessoa();
		sofia.nome = ("Sofia");
		sofia.cpf = 92765482l;
		sofia.dataNascimento = ("27/10/2005");
		
		System.out.println("Nome: "+maria.nome);
		System.out.println("CPF: "+maria.cpf);
		System.out.println("Data de Nascimento: "+maria.dataNascimento);
		System.out.println("");
		System.out.println("Nome: "+bruna.nome);
		System.out.println("CPF: "+bruna.cpf);
		System.out.println("Data de Nascimento: "+bruna.dataNascimento);
		System.out.println("");
		System.out.println("Nome: "+sofia.nome);
		System.out.println("CPF: "+sofia.cpf);
		System.out.println("Data de Nascimento: "+sofia.dataNascimento);
	}

}
