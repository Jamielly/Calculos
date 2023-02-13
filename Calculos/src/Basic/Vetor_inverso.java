package Basic;
//Array e estrutura de repetição
public class Vetor_inverso {
public static void main(String[] args) {
	
	int[] vetor = {-5, -6, 15, 50 , 8, 4};
	
	System.out.println("vetor: ");
	int count=0;
	while(count < (vetor.length)){
		System.out.println(vetor[count] + " ");
		count++;
	}
		System.out.println("\n\n Vetor: ");
	for(int i =(vetor.length - 1); i >= 0;i--) {
		System.out.println(vetor[i] + " ");
		}
	}
}
