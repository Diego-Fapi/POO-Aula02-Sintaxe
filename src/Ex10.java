import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int n;
		int result=0;
		
		do{
		System.out.println("Digite um n�mero para ser somado. Quando quiser terminar digite 0");
		System.out.print("N�mero: ");
		n = ler.nextInt();	
		result = result+n;	
		}while(n != 0);
		
		System.out.println("O resultado da soma � "+ result);
		
	}

}
