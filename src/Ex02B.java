import java.util.Scanner;

public class Ex02B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1 = lerNumero(ler, "Digite o primeiro número: ");
		int n2 = lerNumero(ler, "Digite o segundo número ");
		
		validarMenor(n1,n2);
	}
	
	
	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	private static void validarMenor (int n1, int n2) {
		int menor;
		
		if(n1 < n2){
			menor = n1;
		}else {
			menor = n2;
		}
	
	
	System.out.println("O número menor é " + menor);
	}

}
