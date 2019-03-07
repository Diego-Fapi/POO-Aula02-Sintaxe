import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO: Pendente implementação do exercício
		// TODO: Mais tarefas a fazer
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		System.out.printf("Informe um primeiro número:");
		n1 = ler.nextInt();
		
		System.out.printf("Informe um segundo número:");
		n2 = ler.nextInt();
		
		
		if (n1 < n2) {
			System.out.printf("Esse número é menor: " + n1);
		} 
		
		if (n2 < n1) {
				System.out.printf("Esse número é menor: " + n2);
		}
		
	
	
	}

}
