import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		System.out.printf("Informe um primeiro n�mero:");
		n1 = ler.nextInt();
		
		System.out.printf("Informe um segundo n�mero:");
		n2 = ler.nextInt();
		
		
		if (n1 > n2) {
			System.out.printf("Esse n�mero � maior: " + n1);
		} 
		
		if (n1 < n2) {
				System.out.printf("Esse n�mero � maior: " + n2);
		}
		
		else {
			System.out.printf("Ambos os n�meros s�o iguais");
		}
		
		
	}

}
