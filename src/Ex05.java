import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int cod;
		
		System.out.println("1- A Vista no dinheiro");
		System.out.println("2- A vista no d�bito");
		System.out.println("3- 1x no cart�o de cr�dito");
		System.out.println("4- 3x vezes com juros no cart�o de cr�dito");
		System.out.println("5- 6x no cart�o de cr�dito");
		
		System.out.println("Escolha uma das op��es abaixo:");
		cod = ler.nextInt();
		switch(cod) {
		case 1:
			System.out.println("Desconto de 12%");
		break;
		case 2:
			System.out.println("Desconto de 3%");
			break;
		case 3:
			System.out.println("Mesmo pre�o");
			break;
		case 4:
			System.out.println("Acr�scimo de 5%");
			break;
		case 5:
			System.out.println("Acr�scimo de 10%");
			break;
		default:
			System.out.println("Essa op��o n�o exite");
			
		}
	}
}
