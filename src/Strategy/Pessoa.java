package Strategy;

public abstract class Pessoa{
	String nome;
	String data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public abstract String getC();
	
	
}
