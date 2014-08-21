package Strategy;

import java.util.LinkedList;
import java.util.List;

public class GeradorPessoaJuridica implements Gerador{

	public Pessoa gerador (String p) {
		PessoaJuridica PJ = new PessoaJuridica();
		String [] pessoaJ = p.split("#");
		PJ.setCNPJ(pessoaJ[0]);
		PJ.setData(pessoaJ[1]);
		PJ.setNome(pessoaJ[2]);
		return PJ;
	}

}
