
public class Ex13B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numerosOrdenados();
	}
	
	
	private static void numerosOrdenados () {
		int x;
		
		for(x=100;x>=0;x-=2) {
			if(x % 2 == 0) {
				System.out.println("O número " + x + " é par.");
			}
			
		}	
	}

}
