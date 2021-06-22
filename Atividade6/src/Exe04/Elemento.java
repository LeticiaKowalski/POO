package Exe04;

public class Elemento<Elemento> {
	
		private String chave;
		private Elemento valor;
	
		public Elemento(String chave, Elemento valor) {
			setChave(chave);
			setValor(valor);
		}
	
		public String getChave() {
			return chave;
		}
		public void setChave(String chave) {
			this.chave = chave;
		}
		
		public Elemento getValor() {
			return valor;
		}
		public void setValor(Elemento valor) {
			this.valor = valor;
		}
		
}
