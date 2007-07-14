package br.com.hosthelpdesk.action;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import br.com.hosthelpdesk.model.Categoria;
import br.com.hosthelpdesk.model.Chamado;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/**
 * @author brunobarros
 * @since 13/07/2004
 *
 */
public class ChamadoAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String NOVO = "novo";
	
	private List categorias;
	private Chamado chamado;

	public String novo() throws Exception {
		prepare();
		return NOVO;
	}

	public Object inserir() throws Exception {
		return SUCCESS;
	}
	
	public void prepare() throws Exception {
		Categoria categoria = new Categoria(null, "Pagamentos");
		this.categorias = Arrays.asList(new Categoria[]{categoria});
	}

	public Collection getCategorias() {
		return categorias;
	}

	public void setCategorias(List categorias) {
		this.categorias = categorias;
	}

	public Chamado getChamado() {
		return chamado;
	}

	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}
	
}
