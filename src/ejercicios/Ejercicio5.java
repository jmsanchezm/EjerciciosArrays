package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double max, min;
		
		Scanner read= new Scanner (System.in);
		
		double numReales []= new double [10];
		
		for (int i=0; i<numReales.length;i++) {
			System.out.println("Introduzca un número real: ");
			numReales[i]=read.nextDouble();
		}
		min = numReales [0];
		max = numReales [0];
		
		for (double valor:numReales) {
			if (valor<max)
				max= valor;
			if (valor>min)
				min=valor;
		}
		
		System.out.println("El valor mínimo es " + min);
		System.out.println("El valor máximo es " + max);
	}

}
