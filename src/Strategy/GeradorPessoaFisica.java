package Strategy;

import java.util.LinkedList;
import java.util.List;

public class GeradorPessoaFisica implements Gerador {

	
	public Pessoa gerador (String p) {
		PessoaFisica PF = new PessoaFisica();
		String [] pessoaF = p.split("#");
		PF.setCPF(pessoaF[0]);
		PF.setData(pessoaF[1]);
		PF.setNome(pessoaF[2]);
		return PF;
		
	
	} 
	
}
