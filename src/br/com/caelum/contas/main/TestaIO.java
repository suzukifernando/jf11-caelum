package br.com.caelum.contas.main;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaIO {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		OutputStream os = new FileOutputStream("/home/oo7186/teste.txt");
		PrintStream ps = new PrintStream(os);
		while (sc.hasNextLine()){
			String linha = sc.nextLine();
			linha = linha.toUpperCase();
			ps.println(linha);
		}
		sc.close();
		ps.close();
	}
}
