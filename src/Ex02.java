import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO: Pendente implementa��o do exerc�cio
		// TODO: Mais tarefas a fazer
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		System.out.printf("Informe um primeiro n�mero:");
		n1 = ler.nextInt();
		
		System.out.printf("Informe um segundo n�mero:");
		n2 = ler.nextInt();
		
		
		if (n1 < n2) {
			System.out.printf("Esse n�mero � menor: " + n1);
		} 
		
		if (n2 < n1) {
				System.out.printf("Esse n�mero � menor: " + n2);
		}
		
	
	
	}

}
