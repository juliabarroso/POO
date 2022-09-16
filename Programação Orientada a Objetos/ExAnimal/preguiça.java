package POO;

public class preguiça extends animal{

    public Preguiça(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom(String emitirSom) {
        System.out.println("\nO bicho preguiça emite um som discreto");
    }

    @Override
    public void deslocamento(String deslocamento) {
        System.out.println("O bicho preguiça sobe árvores");
    }

    public void imprimirP(String emitirSom, String deslocamento) {
        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSom emitido: " + emitirSom + 
        "\nDeslocamento: " + deslocamento);
    }

}