package Contas;

import java.util.Scanner;

public class Calculando implements Calculos {
	Scanner ler = new Scanner (System.in);
	
	int soma,sub,mult,div,exp;
	
	
	@Override
	public double somar(int n1, int n2) {
		System.out.print ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print ("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		soma = n1 + n2;
		
		return soma;
	}
	@Override
	public double sub(int n1, int n2) {
		System.out.print ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print ("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		sub = n1 - n2;
		
		
		return sub;
	}
	@Override
	public double mult(int n1, int n2) {
		System.out.print ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print ("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		mult = n1 * n2;
		
		return mult;
	}
	@Override
	public int div(int n1, int n2) {
		System.out.print ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print ("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		div = n1/n2;
		
		return div;
	}
	@Override
	public int exp(int n1, int n2) {
		
		System.out.print ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print ("Informe o valor do expoente: ");
		n2 = ler.nextInt();
		
		exp = n1^n2;
		return exp;
	}

}
