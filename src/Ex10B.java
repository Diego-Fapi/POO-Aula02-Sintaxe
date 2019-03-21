import java.util.Scanner;

public class Ex10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n = lerNumero(ler, "Digite um número para ser somado. Quando quiser terminar digite 0. ");
		
		mostrarNumero(n);
	}

	
	private static int lerNumero(Scanner ler, String mensagem) {
		int result = 0;
		int n;
		
		do {
		System.out.println(mensagem);
		n =  ler.nextInt();
		result = result+n;
		}while(n != 0);
		
		return result;
	}
	
	
	private static void mostrarNumero(int n) {
		System.out.println("O resultado da soma é "+ n);
	}
	
	
}
