import java.util.Scanner;

public class Ex01B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1 = lerNumero(ler, "Digite o primeiro número: ");
		int n2 = lerNumero(ler, "Digite o segundo número ");
		
		validarMaior(n1,n2);
	}
	
	
	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	private static void validarMaior (int n1, int n2) {
		int maior;
		
		if(n1 > n2){
			maior = n1;
		}else {
			maior = n2;
		}
	
	
	System.out.println("O número maior é " + maior);
	}

}
