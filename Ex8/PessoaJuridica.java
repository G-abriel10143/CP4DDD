package Ex8;



import Ex8.continha;
import Ex8.Cliente;

public class PessoaJuridica extends Cliente implements continha {

	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {

	}

	@Override
	public String verNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
