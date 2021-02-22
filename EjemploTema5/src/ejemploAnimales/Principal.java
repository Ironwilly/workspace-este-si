package ejemploAnimales;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Animal a= new Animal ("León",1);
		Animal presa =new Animal ("Gacela de Thomson",0);
		
		a.localizar(presa);
		a.cazar(presa);

	}

}
