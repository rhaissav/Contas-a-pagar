
public class ContaPagar {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	//contrutor 
	ContaPagar(){
		
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor,
	           String dataVencimento){
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	void pagar () {
		
		System.out.println("descrição da conta: "+ this.getDescricao() + 
				           "\nvalor: " + this.getValor() + 
				           "\nData de Vencimento: "+ this.getDataVencimento()+
				           "\nFornecedor: "+ this.getFornecedor().getNome() +".\n\n");
	}
	
	

}
