package Exe04;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
	public class Lista {

	private List<Elemento> lista = new ArrayList<Elemento>();

		public boolean inserir(Elemento elemento) {
			if (!confirma(elemento)) {
				return lista.add(elemento);
			} else {
				return false;
			}
		}

		public Elemento buscar(String chave) {
			for (Elemento elemento : lista) {
				if(chave.equals(elemento.getChave())) {
					return elemento;
				}
			}
			return null;
		}
		
		public boolean confirma(Elemento e) {
			for (Elemento elemento : lista) {
				if(e.getChave().equals(elemento.getChave())) {
					return true;
				}
			}
			return false;
		}
		
}
