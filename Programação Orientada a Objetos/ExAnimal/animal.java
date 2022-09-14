package POO;

public class animal {

	
	//atributos
	private String nome;
	private int idade;
	private String origem;
	private String som;

	//construtor
	public animal(String nome, int idade, String origem, String som){
		
		this.nome = nome;
		this.idade = idade;
		this.origem = origem;
		this.som = som;
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getOrigem() {
		return origem;
	}



	public void setOrigem(String origem) {
		this.origem = origem;
	}



	public String getSom() {
		return som;
	}



	public void setSom(String som) {
		this.som = som;
	}



	
	
	
}
