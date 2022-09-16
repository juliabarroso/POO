package POO;

public class cachorro extends animal{ //criando herança

    public cachorro(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }

    //métodos
    @Override
    public void emitirSom(String emitirSom) {
        System.out.println("\nO cachorro late");
    }

    @Override
    public void deslocamento(String deslocamento) {
        System.out.println("\nO cachorro corre");
    }

    public void imprimirC(String emitirSom, String deslocamento) {
        System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSom emitido: " + emitirSom + 
        "\nDeslocamento: " + deslocamento);
    }


}