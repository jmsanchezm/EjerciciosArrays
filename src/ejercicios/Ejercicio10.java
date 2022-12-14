package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int valor;
		int cont=0;
		int numEntero []= new int [100];
		Scanner read= new Scanner (System.in);
		 for (int i = 0 ; i < numEntero.length; i++) {
			 numEntero[i]= (1 + (int)(Math.random()*10));
		 }
		System.out.println("Introduzca un número del 1 al 10: ");
			valor = read.nextInt();
			
			for (int value: numEntero) {
				if (valor == value) {
					cont++;
				}
			}
			System.out.println("Hay " + cont + " números con el número introducido");
	}

}
