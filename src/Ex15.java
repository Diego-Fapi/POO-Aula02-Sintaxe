import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int x;
		int vetor[] = new int[5];
		
		for(x=0;x<5;x++) {
			System.out.print("Digite um número: ");
			vetor[x] = ler.nextInt();
		}
		
		for(x=0;x<5;x++) {
			System.out.println(vetor[x]);
		}
		
	}

}
