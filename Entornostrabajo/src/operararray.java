
public class operararray {

	static int array[]= new int [10];
	static int numeroaleatorio=0;
	static int suma=0;
	public static void main(String[] args) {
		rellenararray();
		imprimirarray();
		sumararray();
	}

	public static void rellenararray() {
		for (int i=0;i<array.length;i++) {
			numeroaleatorio=(int)Math.round(Math.random()*19+1);
			array[i]=numeroaleatorio;
			System.out.println(array[i]);
		}
	}
	
	public static void imprimirarray() {
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		
	}
		
	public static void sumararray() {
		for(int i=0;i<array.length;i++) {
		suma+=array[i];	
	}
	//copia1
		
	//Ahora copia2
}
