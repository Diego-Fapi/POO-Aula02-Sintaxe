import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		System.out.printf("Informe um primeiro número:");
		n1 = ler.nextInt();
		
		System.out.printf("Informe um segundo número:");
		n2 = ler.nextInt();
		
		
		if (n1 > n2) {
			System.out.printf("Esse número é maior: " + n1);
		} 
		
		if (n1 < n2) {
				System.out.printf("Esse número é maior: " + n2);
		}
		
		else {
			System.out.printf("Ambos os números são iguais");
		}
		
		
	}

}
