package POO;

public abstract class animal {

        //atributos
        protected String nome;
        protected int idade;

        public animal(String nome, int idade) {
            super();
            this.nome = nome;
            this.idade = idade;
        }

        //métodos
        abstract public void emitirSom(String emitirSom);
        abstract public void deslocamento(String deslocamento);

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






}