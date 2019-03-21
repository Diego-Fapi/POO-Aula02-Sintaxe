import java.util.Scanner;

public class Ex18B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = lerNumero(ler, "Digite um número: ");
		
		ordenarNumeros(vetor);
		
		mostrarNumeros(vetor);
	}
	
	
	private static int[] lerNumero(Scanner ler, String mensagem) {
		int vetor[] = new int[10];
		int x;
		
		for(x=0;x<vetor.length;x++) {
			System.out.print(mensagem);
			vetor[x] = ler.nextInt();
		}
		return vetor;
	}
	
	
	private static void ordenarNumeros(int[] vetor) {
		int x,y,aux;
		for(x=0;x<vetor.length;x++) {
			for(y=x;y<vetor.length;y++) {
				if(vetor[x] > vetor[y]) {
					aux = vetor[x];
					vetor[x] = vetor[y];
					vetor[y] = aux;
				}
			}
		}
	}
	
	
	
	private static void mostrarNumeros(int[] vetor) {
		int x;
		for(x=0;x<vetor.length;x++) {
			System.out.println("Número: " + vetor[x]);
		}
	}

}
