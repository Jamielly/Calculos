package Basic;

import java.util.Scanner;

public class Par_e_impar {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int quantNum, num, quantPar = 0, quantImpar = 0;
	
	System.out.println("Quant de numeros: ");
	quantNum = scan.nextInt();
	
	int count = 0;
	do {
		System.out.println("Numero: ");
		num = scan.nextInt();
		
		if (num % 2 == 0)quantPar++;
		else quantImpar++;
		
		count++;
	}
	while(count < quantNum);
	System.out.println("Quant de numeros pares: " + quantPar);
	System.out.println("Quant de numeros impar: "+ quantImpar);
	}
}

