import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		int vetor[] = new int[10];
		
		for(x=0;x<vetor.length;x++) {
			System.out.print("Digite um número: ");
			vetor[x] = ler.nextInt();
		}
		
		for(x=vetor.length-1;x>=0;x--) {
			System.out.println(vetor[x]);
		}

	}

}
