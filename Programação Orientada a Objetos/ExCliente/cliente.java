package POO;
//definição da classe cliente
public class cliente {
	
//declaração dos atributos da classe
	
private String nomeCliente;
private String sobrenome;
private int idade;
private double altura;

//construtor com parâmetros
public cliente(String nomeCliente, String sobrenome, int idade, double altura) {
	
	this.nomeCliente = nomeCliente;
	this.sobrenome = sobrenome;
	this.idade = idade;
	this.altura = altura;
}
//declaração dos demais métodos da classe

public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public double getAltura() {
	return (double) altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public void imprimirInfo() {
	System.out.println("\n" + nomeCliente + " de sobrenome " + sobrenome + " é nosso cliente, cadastrad(o/a) com os seguintes dados:\n" + idade + " anos de idade" + "\n" + altura + " metros de altura");
	
}


	
	

}
