import java.util.Scanner;

public class Ex12B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1 = lerNumero(ler, "Digite o primeiro número: ");
		int n2 = lerNumero(ler, "Digite o segundo número ");
		
		validareMostar(n1,n2);

	}
		
	
	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	
	private static void validareMostar (int n1, int n2) {
		int x;
		
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
