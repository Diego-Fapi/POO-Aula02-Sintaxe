import java.util.Scanner;

public class Ex06B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n1 = lerNumero(ler, "Digite o primeiro número: ");
		int n2 = lerNumero(ler, "Digite o segundo número ");
		
		mostrarOpcoes();
		
		int op = lerOpcao(ler, "Escolha uma das opções acima: ");
				
		validarOpcao(op,n1,n2);
	}
	
	
	private static int lerNumero(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	
	private static void mostrarOpcoes(){
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
	}
	
	
	private static int lerOpcao(Scanner ler, String mensagem) {
		System.out.println(mensagem);
		return ler.nextInt();
	}
	
	
	private static void validarOpcao (int op, int n1, int n2) {
		int result;
		
		switch(op) {
		case 1:
			result = n1+n2;
			System.out.println("Resultado: "+ result);
		break;
		case 2:
			result = n1-n2;
			System.out.println("Resultado: "+ result);
		break;
		case 3:
			result = n1*n2;
			System.out.println("Resultado: "+ result);
		break;
		case 4:
			if(n2 == 0){
			System.out.println("Não é possivel dividir por zero :p");
			break;
			}else
			result = n1/n2;
			System.out.println("Resultado: "+ result);
		break;
		}
	
	

	}

}
