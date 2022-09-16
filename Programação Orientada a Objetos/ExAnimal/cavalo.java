package POO;

public class cavalo extends animal {
	
	public cavalo(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom(String emitirSom) {
        System.out.println("\nO cavalo relincha");
    }

    @Override
    public void deslocamento(String deslocamento) {
        System.out.println("O cavalo corre");
    }

    public void imprimirCv(String emitirSom, String deslocamento) {
        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSom emitido: " + emitirSom + 
        "\nDeslocamento: " + deslocamento);
    }

	
		
	
	

}
