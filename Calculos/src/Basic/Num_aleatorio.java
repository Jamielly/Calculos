package Basic;

import java.util.Random;

public class Num_aleatorio {
	public static void main(String[] args) {
	Random random = new Random();
	
	int[] numAleatorio = new int[20];
	
	for(int i=0; i<numAleatorio.length;i++) {
		int num = random.nextInt(100);
		numAleatorio[i] = num;
	}
	System.out.println("Numeros aleatorios: ");
	for (int num : numAleatorio) {
		System.out.print(num + " ");
		
	}
	System.out.print("\n Sucessores dos numeros aleatorios: ");
	for (int num : numAleatorio) {
		System.out.print((num+1) + " ");
	}
	System.out.println("Antecessor dos numeros aleatorios: ");
	for (int num : numAleatorio) {
		System.out.println((num-1)+ " ");
}
	}
}
