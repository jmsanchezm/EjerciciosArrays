package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int suma=0;
		int numAleatorios [] = new int [10];
		for (int i = 0; i<numAleatorios.length; i ++) {
			numAleatorios [i]=(int)(Math.random()*100+1);
			suma+=numAleatorios[i];
			}
		System.out.println(suma);

	}

}
