package Strategy;

public class PessoaJuridica extends Pessoa{
	String CNPJ;
	
	public String toString(){
		String pj= "";
		pj += "#" + this.getNome();
		pj += "#" + this.getData();
		pj += "#" + this.getC();
		return pj;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getC() {
		return this.CNPJ;
	}
	
	
}
