import java.util.Scanner;

public class Ex04B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1 = lerNumero(ler, "Informe o primeiro número: ");
		int n2 = lerNumero(ler, "Informe o segundo número: ");
		int n3 = lerNumero(ler, "Informe o terceiro número: ");
		ordenarNumeros(n1,n2,n3);
	}
	
	
	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	
	private static void ordenarNumeros (int n1, int n2, int n3) {
		
		if (n1 < n2 && n2 < n3) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}

		if (n1 < n3 && n3 < n2) {
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		}
		if (n3 < n1 && n1 < n2) {
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
		}

		if (n2 < n1 && n1 < n3) {
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}

		if (n2 < n3 && n3 < n1) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		}
		if (n3 < n2 && n2 < n1) {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		}
	
	}
}

