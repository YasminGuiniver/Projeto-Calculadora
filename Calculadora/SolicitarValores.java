package Calculadora;

import java.util.Scanner;

public class SolicitarValores {
		
//	double valor1 , valor2;
	Soma so = new Soma ();
	Subtracao sub = new Subtracao ();
	Multiplicacao mult = new Multiplicacao ();
	Divisao divi = new Divisao ();
	
	
	Scanner in = new Scanner (System.in);
	
	public void SolicitarValores () {
		so.Soma(20, 2);	
		System.out.println(this.so);
		sub.Sub(20, 2);
		System.out.println(this.sub);
		mult.Mult(20, 2);
		System.out.println(this.mult);
		divi.Divisao(20, 2);
		System.out.println(this.divi);
}
}
