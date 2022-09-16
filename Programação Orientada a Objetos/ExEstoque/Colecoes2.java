package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();//criando um objeto do tipo ArrayList
		
		do {
			System.out.println("\n\t\tMenu de opções do Estoque");
			System.out.println("\n1) Deseja adicionar produtos no estoque?");
			System.out.println("\n2) Deseja remover produtos do estoque?");
			System.out.println("\n3) Deseja atualizar produtos do estoque?");
			System.out.println("\n4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n0) Deseja encerrar o programa?");
			System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o produto para adicionar no estoque: ");
				String produto = leia.nextLine();//nextLine lê um valor do tipo String
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)) {//verifica se o produto1 está contido dentro do estoque
					estoque.remove(produto1);
					
				}else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do "+ verifica +" : ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nObrigada em utilizar do nosso sistema!!");
				break;
				default:
					System.out.println("\nOpção inválida!!!");
			}
			
		}
		while(op!=0);
	}

}