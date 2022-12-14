package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numeros []= new int [20];
		int cuadrados []= new int [20];
		int cubos []= new int [20];
		
		for (int i =0; i<numeros.length; i++) {
			numeros [i]= (int)(Math.random()*100);
			cuadrados [i]=(int)(Math.pow(i, 2));
			cubos [i]=(int)(Math.pow(i,3));		
		}
		for (int i = 0; i<numeros.length; i++) {
			System.out.println(numeros[i] + " "+ cuadrados[i] + " " + cubos [i]);
		}
	}

}
