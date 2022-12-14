package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int ordenanum []= new int [10];	
		
		Scanner read= new Scanner (System.in);
		
		for(int i=0; i<ordenanum.length;i++) {
			System.out.println("Introduzca un número: ");
			ordenanum[i]=read.nextInt();
		}
		
		for (int i=ordenanum.length-1;i>=0;i--) {
			System.out.println(ordenanum[i]);
		}
		
	}

}
