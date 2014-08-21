package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	
	private List<Pessoa> pessoa;
	
	public Cadastro(){
		pessoa = new ArrayList <Pessoa>();
	}
	
	public void cadastrarPessoa( String p, Gerador g){
		pessoa.add(g.gerador(p));
	}
	
	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoa(){
		return pessoa;
	}
	
}
