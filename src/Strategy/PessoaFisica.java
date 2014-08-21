package Strategy;

public class PessoaFisica extends Pessoa {
	String CPF;

	public String toString(){
		String pf= "";
		pf += "#" + this.getNome();
		pf += "#" + this.getData();
		pf += "#" + this.getC();
		return pf;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String getC() {
		return this.CPF;
	}
	
	
}
