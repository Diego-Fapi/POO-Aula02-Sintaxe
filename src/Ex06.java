import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner ler = new Scanner(System.in);
		
		int n1, n2, op, result;
		
		System.out.println("Digite o primeiro n�mero:");
		n1= ler.nextInt();
		System.out.println("Digite segundo numero:");
		n2= ler.nextInt();
		System.out.println("Escolha uma op��o:");
		System.out.println("1- Soma");
		System.out.println("2- Subtra��o");
		System.out.println("3- Multiplica��o");
		System.out.println("4- Divis�o");
		
		System.out.print("Op��o:");
		op = ler.nextInt();
		
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
			System.out.println("N�o � possivel dividir por zero :p");
			break;
			}else
			result = n1/n2;
			System.out.println("Resultado: "+ result);
		break;
		}
		
	}

}
