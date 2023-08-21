package listas;

import java.util.List;
import java.util.ArrayList;

public class Q01 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
				
		lista.add(15);
		lista.add(8);
		lista.add(23);
		lista.add(19);
		lista.add(27);
		lista.add(5);
		
		int maior = lista.get(0);
		
		for(int i= 0; i < lista.size(); i++) {
			
			if(lista.get(i) > maior ) {
				maior = lista.get(i);
			}
		}
	
		System.out.println(lista.toString());
		lista.remove(Integer.valueOf(maior));
		System.out.println(lista.toString());
	}

}