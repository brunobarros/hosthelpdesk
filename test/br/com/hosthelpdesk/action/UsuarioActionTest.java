package br.com.hosthelpdesk.action;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

public class UsuarioActionTest {

	private UsuarioAction action;

	@Before
	public void setUp() throws Exception {
		action = new UsuarioAction();
	}
	
	@Test
	public void testLogin() throws Exception {
		assertEquals("Mensagem de retorno não corresponde ao esperado.", 
				ActionSupport.SUCCESS, action.login());
	}

}
