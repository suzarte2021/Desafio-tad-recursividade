package DadosColega;

public class ListaDadosColega  implements DadosColega{

	// 1- Crie um TAD para armazenar dados dos colegas de Estrutura de Dados: Nome, email, telefone.

	  // 2- Faça um programa que implemente recursividade
	// onde deverá multiplicar os números compreendidos de 1 até o número que o usuário desejar.

	private String[] nome;
	private String email;
	private String telefone;


	//construtor
	public ListaDadosColega(String[] nome, String email, String telefone) {
	super();
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;

	}
	public boolean add(String nome,String email, String telefone ) {
	return true;

	}
	}










