
public class Endereco {
	private int id;
	private String cep;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(int id, String cep, String rua, int numero, String bairro, String cidade, String uf) {
		this.id = id;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	//Getters e Setters
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//-------------------------
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	//-------------------------
	public String getRua() {
		return this.rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	//-------------------------
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//-------------------------
	public String getBairro() {
		return this.bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	//-------------------------
	public String getCidade() {
		return this.cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//-------------------------
	public String getUF() {
		return this.uf;
	}
	
	public void setUF(String uf) {
		this.uf = uf;
	}
}
