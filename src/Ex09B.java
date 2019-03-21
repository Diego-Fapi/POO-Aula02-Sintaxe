
public class Ex09B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarSoma();
	}
	
	
	private static void mostrarSoma(){
		int x;
		int result=0;
		
		
		for(x=1;x<11;x++) {	
			result=result+x;	
		}
		System.out.println("Total da soma: " + result);
	}

}
