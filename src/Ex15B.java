import java.util.Scanner;

public class Ex15B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = lerNumero(ler, "Digite um número: ");
		
		mostrarNumeros(vetor);
	}
	
	
	private static int[] lerNumero(Scanner ler, String mensagem) {
		int vetor[] = new int[5];
		int x;
		
		for(x=0;x<5;x++) {
			System.out.print(mensagem);
			vetor[x] = ler.nextInt();
		}
		return vetor;
	}
	
	private static void mostrarNumeros(int[] vetor) {
		int x;
		for(x=0;x<5;x++) {
			System.out.println("Número: " + vetor[x]);
		}
	}

}
