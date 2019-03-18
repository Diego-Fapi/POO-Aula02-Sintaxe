import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int x,y,aux;
		int vetor[] = new int[10];
		
		for(x=0;x<vetor.length;x++) {
			System.out.print("Digite um número: ");
			vetor[x] = ler.nextInt();
		}
		
		for(x=0;x<vetor.length;x++) {
			for(y=x;y<vetor.length;y++) {
				if(vetor[x] > vetor[y]) {
					aux = vetor[x];
					vetor[x] = vetor[y];
					vetor[y] = aux;
				}
			}
		}
		
		for(x=0;x<vetor.length;x++) {
			System.out.println(vetor[x]);
		}
		
	}

}
