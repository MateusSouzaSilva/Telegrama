
public class Telegrama extends Endereco {
	
	private String rua, bairro,cidade;
	private int numero;
	private double cep;

	//***contrutor com parametros
	public Telegrama(String Destinatario, String Remetente, 
			String texto, String rua, int numero, String bairro, String cidade,
			double cep){
		super(Destinatario, Remetente, texto);
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public double getCep() {
		return cep;
	}
	public void setCep(double cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}	
}
