import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.printf("Informe o primeiro n�mero:");
		n1 = ler.nextInt();
		
		System.out.printf("Informe o segundo n�mero:");
		n2 = ler.nextInt();
		
		System.out.printf("Informe o terceiro n�mero:");
		n3 = ler.nextInt();
		
		
		
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
