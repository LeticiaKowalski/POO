package Exe02;

public class Produto<Produto> {
	
	private double valor;
	private Produto id;
	private String produto;
	private String dataFabricacao;
	private String dataVencimento;
	
	public Produto() {
		
	}
	
	public Produto(Produto id, String produto, double valor, String dataFabricacao, String dataVencimento) {
		setId(id);
		setProduto(produto);
		setValor(valor);
		setDataFabricacao(dataFabricacao);
		setDataVencimento(dataVencimento);	
	}
	
	public Produto getId() {
		return id;
	}
	
	public void setId(Produto id) {
		this.id = id;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		if(produto.length() > 0) {
			this.produto = produto;
		}
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}
	
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		if(dataFabricacao.length() > 0) {
			this.dataFabricacao = dataFabricacao;
		}
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		if(dataVencimento.length() > 0) {
			this.dataVencimento = dataVencimento;
		}
	}
	
	// SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto ");
		builder.append("\nId: ");
		builder.append(id);
		builder.append("\nProduto: ");
		builder.append(produto);
		builder.append("\nValor: ");
		builder.append(valor);
		builder.append("\nData de Fabricação: ");
		builder.append(dataFabricacao);
		builder.append("\nData de Vencimento: ");
		builder.append(dataVencimento);
		return builder.toString();
	}
	
}
