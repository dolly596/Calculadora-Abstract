package Contas;



public class Principal {

	public static void main(String[] args) {
		
		Calculando cal = new Calculando();
		
		cal.somar(0,0);
		System.out.println("O valor da soma é: " + cal.soma);
		System.out.println("\n");
		
		cal.sub(0,0);
		System.out.println("O valor da subtração é: " + cal.sub);
		System.out.println("\n");
		
		cal.mult(0,0);
		System.out.println("O valor da multiplicação é: " + cal.mult);
		System.out.println("\n");
		
		cal.div(0,0);
		System.out.println("O valor da divisão é: " + cal.div);
		System.out.println("\n");
		
		cal.exp(0,0);
		System.out.println("O valor da potência é: " + cal.exp);
		System.out.println("\n");
	}

}
