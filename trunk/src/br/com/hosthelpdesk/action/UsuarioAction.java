package br.com.hosthelpdesk.action;

import com.opensymphony.xwork2.ActionSupport;


public class UsuarioAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String senha;
	
	public String login() throws Exception {
		return SUCCESS;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
