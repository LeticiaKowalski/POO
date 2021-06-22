package Exe04;

public class Principal {

	public static void main(String[] args) {

		Elemento<Integer> e1 = new Elemento<Integer>("Let�cia Kowalsi", 10);
		Elemento<String> e2 = new Elemento<String>("Let�cia Kowalski", "10");
		Elemento<String> e3 = new Elemento<String>("10", "Let�cia Kowalski");
				
		Lista lista = new Lista();
		
		System.out.println(lista.inserir(e1));
		System.out.println(lista.inserir(e2));
		System.out.println(lista.inserir(e3));
		
		System.out.println("\nBuscando pelo valor *Let�cia Kowalski* \nValor: "
		+ lista.buscar("Let�cia Kowalski").getValor());

	}

}
