import java.util.Scanner;

public class Ex05B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		mostrarOpcoes();
		
		int cod = lerCod(ler, "Escolha uma das opções acima: ");
		
		validarCodigo(cod);
	}
	
	
	private static void mostrarOpcoes(){
		System.out.println("1- A Vista no dinheiro");
		System.out.println("2- A vista no débito");
		System.out.println("3- 1x no cartão de crédito");
		System.out.println("4- 3x vezes com juros no cartão de crédito");
		System.out.println("5- 6x no cartão de crédito");
	}
	
	
	private static int lerCod(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	private static void validarCodigo (int cod) {
		switch(cod) {
		case 1:
			System.out.println("Desconto de 12%");
		break;
		case 2:
			System.out.println("Desconto de 3%");
			break;
		case 3:
			System.out.println("Mesmo preço");
			break;
		case 4:
			System.out.println("Acréscimo de 5%");
			break;
		case 5:
			System.out.println("Acréscimo de 10%");
			break;
		default:
			System.out.println("Essa opção não exite");
			
		}
	
	}

}
