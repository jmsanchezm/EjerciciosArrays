package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner read= new Scanner (System.in);
		double numDecimal[]= new double[5];
		for (int i=0; i<numDecimal.length;i++) {
			System.out.println("Introduzca 5 números decimales: ");
			numDecimal [i]=read.nextDouble();
		}
		for (double valor: numDecimal) {
			System.out.println(valor);
		}
		read.close();

	}

}
