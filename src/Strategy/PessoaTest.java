package Strategy;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	private Cadastro cadastro;
	
	
	@Before
	public void criar(){
		cadastro = new Cadastro();
	}

	@Test
	public void cadastrarPessoaFisica() {
		String pessoa1= "Nayanne#12/04/1988#0000000";
		cadastro.cadastrarPessoa(pessoa1, new GeradorPessoaFisica());
		Assert.assertEquals(1, cadastro.getPessoa().size());
		
	}
	@Test
	public void cadastrarPessoaJuridica() {
		String pessoa2= "Jonata#05/03/1987#00055500";
		cadastro.cadastrarPessoa(pessoa2, new GeradorPessoaJuridica());
		Assert.assertEquals(1, cadastro.getPessoa().size());
	}
	
}
