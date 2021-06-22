package Exe01;

public class Pessoa {
	
		private String nome;
		private int idade;
	
		public Pessoa() {

		}
		
		public Pessoa(String nome, int idade) {
			setNome(nome);
			setIdade(idade);
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			if(nome.length() > 0) {
				this.nome = nome;
			}
		}
		
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			if(idade > 0) {
				this.idade = idade;
			}
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Pessoa ");
			builder.append("\nNome: ");
			builder.append(nome);
			builder.append("\nIdade: ");
			builder.append(idade);
			return builder.toString();
		}
}
