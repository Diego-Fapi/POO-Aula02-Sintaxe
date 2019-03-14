import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner ler = new Scanner(System.in);
		
		int n1, n2, op, result;
		
		System.out.println("Digite o primeiro número:");
		n1= ler.nextInt();
		System.out.println("Digite segundo numero:");
		n2= ler.nextInt();
		System.out.println("Escolha uma opção:");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		
		System.out.print("Opção:");
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
			System.out.println("Não é possivel dividir por zero :p");
			break;
			}else
			result = n1/n2;
			System.out.println("Resultado: "+ result);
		break;
		}
		
	}

}
