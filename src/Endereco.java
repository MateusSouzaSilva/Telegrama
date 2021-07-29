
public class Endereco {
	private String Destinatario, Remetente, texto;

	public Endereco(String Destinatario, String Remetente, String texto){
		this.Destinatario = Destinatario;
		this.Remetente = Remetente;
		this.texto = texto;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.Destinatario = nomeDestinatario;
	}

	public String getDestinatario() {
		return Destinatario;
	}
	
	public void setNomeRemetente(String nomeRemetente) {
		this.Remetente = nomeRemetente;
	} 
	
	public String getNomeRemetente() {
		return Remetente;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
}
