package Basic;
//Array e estrutura de repetição
import java.util.Scanner;

public class Consoantes {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String[] consoantes = new String[6];
	int quantConsoante = 0;
	
	int count =0;
	do {
		System.out.println("Letra: ");
			String letra = scan.next();
		
			if(letra.equalsIgnoreCase("a")|
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u")) {
				consoantes[count] = letra;
				quantConsoante++;
			}
			
			count++;	
		
	}while(count < consoantes.length);
	
	System.out.println("Consoante: ");
	for(String consoante : consoantes) {
		if (consoante != null)
			System.out.println(consoante + " ");
	}
	System.out.println("Quantidade de consoantes é: "+ quantConsoante);
	System.out.println(consoantes.length);
}
}
