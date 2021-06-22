package Exe02;

public class Principal {

	public static void main(String[] args) {
		
		Produto<Integer> p1 = new Produto<Integer>(724, "Above", 10.00, "03/03/2021", "03/03/2023");
		
		Produto<String> p2 = new Produto<String>("KSA295", "Trident", 6.99, "10/01/2020", "10/09/2021");

		System.out.println(p1);
		System.out.println(p2);
	}

}
