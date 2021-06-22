package Exe01;

public class Principal {
	
	public static void main(String[] args) {

		Elemento<String> elemento1 = new Elemento<>("Atividade06");
		String str = elemento1.getElemento();
		
		Elemento<Pessoa> elemento3 = new Elemento<>(new Pessoa("Letícia Kowalski", 20));
		Pessoa pessoa = elemento3.getElemento();
		
		Elemento<Integer> elemento2 = new Elemento<>(400);
		int aux = elemento2.getElemento();
		
		System.out.println(str);
		System.out.println(aux);
		System.out.println(pessoa);
		
	}
}
