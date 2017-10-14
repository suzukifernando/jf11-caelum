package br.com.caelum.contas.main;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Scanner;

public class TestaIO {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://www.caelum.com.br"); //lendo da internet
		//InputStream is = System.in; // ler do teclado
		//InputStream is = new FileInputStream("/home/oo7186/teste.txt"); // ler de arquivo
		InputStream is = url.openStream();
		Scanner sc = new Scanner(is);
		OutputStream os = new FileOutputStream("/home/oo7186/saida.txt");
		PrintStream ps = new PrintStream(os);
		while (sc.hasNextLine()){
			String linha = sc.nextLine();
			//linha = linha.toUpperCase();
			linha = linha.toLowerCase().replace("e", "*");
			ps.println(linha);
		}
		sc.close();
		ps.close();
	}
}
