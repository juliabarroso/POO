package POO;

public class cachorro extends animal {
	
	//atributos
	private String deslocamento;
	private String raca;	
	
	//construtor
	public cachorro(String nome, int idade, String origem, String som, String deslocamento, String raca) {
		super(nome, idade, origem, som);
		this.deslocamento = deslocamento;
		this.raca = raca;
	} //fim do construtor

	
	
	//métodos
	public String getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(String deslocamento) {
		this.deslocamento = deslocamento;
	}
	
	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}



	public void imprimirCa(){
		System.out.println("\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + "\nOrigem do animal: " + getOrigem() +
		"\nEmite som?: " + getSom() + "\nDeslocamento: " + deslocamento + "\nRaça: " + raca);
	}
	
	
	 
	
	
	
	
	
	

}
