package bean.com.joninunes;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class LoginMB {
	
	private String login, senha, resultado;
	
	
	

	public String logar(){
		if (login.equals("usuario") && senha.equals("1234") ) {
			setResultado("Logado..."); ;
		}
		else
			setResultado("Erro no login !");
		
		return getResultado();
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LoginMB() {
		// TODO Auto-generated constructor stub
	}

}
