import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		
		for(x=-1000;x<=0;x++) {
			if(x % 2 != 0 && x % 9 == 0) {
				System.out.println("O n�mero " + x + " � �mpar e m�ltiplo de nove.");
			}
		}

	}

}
