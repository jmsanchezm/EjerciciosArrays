package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double temperatura [] = new double [12];
		
		Scanner read= new Scanner (System.in);
		
		for (int i = 0 ; i<temperatura.length; i++) {
			System.out.println("Introduzca la media de temperatura de cada mes");
			temperatura [i]= read.nextDouble();
		}
		
		for (double valor: temperatura){
			for (int i =0; i<valor; i++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		}
	
	
	
	
	}


