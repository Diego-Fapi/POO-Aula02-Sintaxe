
public class Ex11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validarNumero();
	}
	
	
	private static void validarNumero () {
		int x;
		
		for(x=0;x<=1000;x+=2) {
			if(x % 3 == 0) {
				System.out.println("O n�mero " + x + " � par e m�ltiplo de tr�s.");
			}
		}
	}

}
