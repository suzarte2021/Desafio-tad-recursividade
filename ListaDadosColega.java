package DadosColega;

public class ListaDadosColega  implements DadosColega{

	// 1- Crie um TAD para armazenar dados dos colegas de Estrutura de Dados: Nome, email, telefone.

	  // 2- Fa�a um programa que implemente recursividade
	// onde dever� multiplicar os n�meros compreendidos de 1 at� o n�mero que o usu�rio desejar.

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










