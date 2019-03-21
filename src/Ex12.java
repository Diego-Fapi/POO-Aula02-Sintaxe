import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int x;
		int n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		
		
		if(n1 > 0 && n1 < 11 && n2 > 0 && n2 < 11) {
			if(n1 != n2) {
				for(x=1;x<=1000;x++) {
					if(x % n1 == 0 && x % n2 == 0) {
						System.out.println("O número " + x + " é múltiplo dos dois números.");
					}
			}
		}else {
			System.out.println("Números iguais");
		}
		
		
		}else {
			System.out.println("Números inválidos");
		}
	}

}
