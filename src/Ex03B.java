import java.util.Scanner;

public class Ex03B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1 = lerNumero(ler, "Informe um número referente ao mes: ");
		validarMes(n1);
	}
	
	
	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	
	private static void validarMes (int n1) {
		switch (n1) {
		case 1:
			System.out.printf("Janeiro");
			break;
		case 2:
			System.out.printf("Fevereiro");
			break;
		case 3:
			System.out.printf("Marco");
			break;
		case 4:
			System.out.printf("Abril");
			break;
		case 5:
			System.out.printf("Maio");
			break;
		case 6:
			System.out.printf("Junho");
			break;
		case 7:
			System.out.printf("Julho");
			break;
		case 8:
			System.out.printf("Agosto");
			break;
		case 9:
			System.out.printf("Setembro");
			break;
		case 10:
			System.out.printf("Outubro");
			break;
		case 11:
			System.out.printf("Novembro");
			break;
		case 12:
			System.out.printf("Dezembro");
			break;
		default:
			System.out.printf("Esse mes nao existe :p");
			break;
	
		}
	}
}
