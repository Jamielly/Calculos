package Basic;

import java.util.Scanner;

public class Nota_e_media {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num, maior = 0, soma = 0,nota;
	
	System.out.println("Nota: ");
	nota = scan.nextInt();
	
	while(nota < 0 | nota > 10) {
		System.out.println("Nota inválidada");
		System.out.println("Digite a nota novamente: ");
		nota = scan.nextInt();
	}
	int count = 0;
	do {
		System.out.println("Numero: ");
		num = scan.nextInt();
		
		soma = soma + num;
		
		
		if (num > maior)maior = num;
		
		count = count+1;
	} while(count < 5);
	
	System.out.println("Maior: "+maior);
	System.out.println("Media: "+(soma/5));
	}
}
