
public class Ex14B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimeNumeros();
	}
	
	
	private static void imprimeNumeros () {
		int x;
		
		for(x=-1000;x<=0;x++) {
			if(x % 2 != 0 && x % 9 == 0) {
				System.out.println("O número " + x + " é ímpar e múltiplo de nove.");
			}
		}
	}

}
