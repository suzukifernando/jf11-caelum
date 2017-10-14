package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestaLista {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(99);
		lista.add(1);
		lista.add(28);
		lista.add(32);
		for (Integer string : lista) {
			System.out.println(string);
		}
		
		Collections.sort(lista);
		
		for (Integer string : lista) {
			System.out.println(string);
		}
	}

}
