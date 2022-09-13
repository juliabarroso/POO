package POO;

public class clienteTeste {

	public static void main(String[] args) {
		// instalar a minha classe Cliente
		
	cliente cliente1 = new cliente("Julia", "Gali", 18, 1.65);
	cliente cliente2 = new cliente("Nícolas", "Pinotti", 18, 2);
	cliente1.imprimirInfo();
	cliente2.imprimirInfo(); 
	
	System.out.println("\n******TRANSFERÊNCIA DE CLIENTE********");
	cliente2.setNomeCliente("Raquel");
	cliente2.setSobrenome("Florêncio");
	cliente2.setIdade(53);
	cliente2.setAltura(1.63);
	
	cliente2.imprimirInfo();
	
	}

}
