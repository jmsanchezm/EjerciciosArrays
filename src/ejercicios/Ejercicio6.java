package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner read= new Scanner (System.in);
		
		int numEntero [] = new int[8];
		
		for (int i =0; i<numEntero.length;i++) {
			System.out.println("Introduzca un número entero: ");
			numEntero [i]= read.nextInt();	
		}
		for (int valor:numEntero) {
			if (valor%2==0)
				System.out.println("ES PAR");
			else 
				System.out.println("ES IMPAR");
		}
	}

}
