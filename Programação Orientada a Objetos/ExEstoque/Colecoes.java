package POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//OBS: estamos importando um por um porque se fosse toda a biblioteca java.util, seria muito pesado


public class Colecoes {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>(); //arrayList é uma subclasse do list
		//o List é uma interface
		//instanciamos Lista em uma classe com herança, para podermos trabalhar com a interface
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(7);

		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			
			System.out.println(listaElementos);
		}
			
		int primeiroElemento = minhaLista.get(0);//serve para pegar um elemento
		System.out.println("\nO primeiro elemento foi: " + primeiroElemento);
		System.out.println();
		
		
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\nElemento: " + minhaLista.get(i));//serve para identificar o tamanho
		}
		
		Collections.sort(minhaLista); //pega a lista de elementos e por em ordem crescente ou alfabética
		System.out.println("\nDepois de ordenada...");
		System.out.println(minhaLista);
		System.out.println();
			
		
	/*colleção é uma collection
	 * List interface
	 * setList é uma classe que está herdada da List
	 * Set é uma interface
	 * hashInterface é uma classe herdada da interface Set
	 */
		
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		meuSet.add(5);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {//pega o primeiro elemento e
			//percorre toda a coleção até não ter mais nenhum elemento, retornando falso e saindo do índice 
			System.out.println(iMeuSet.next());
		}
		
	
		
		
		
		
		
	}
		
		
		
		
	}


