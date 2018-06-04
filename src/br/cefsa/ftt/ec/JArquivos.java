package br.cefsa.ftt.ec;

import java.io.PrintWriter;
import java.util.Random;

public class JArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JArquivos...");
		System.out.println(System.getProperty("user.dir"));
		
		try {
		
		PrintWriter writer = new PrintWriter("jdados.tsv", "UTF-8");
		
		writer.println("BOF");
		
		int contador = 100;
		
		do {
			
			Random rn = new Random();
			
			writer.println(String.valueOf(contador) + "\t" + String.valueOf(rn.nextInt()));
			
			contador--;
			
		} while (contador > 0);
		
		writer.println("EOF");
		
		writer.close();
		
		} catch(Exception e) {
			System.err.println("Ops!!!");
			e.printStackTrace();
		}
	}

}
