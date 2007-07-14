package br.com.hosthelpdesk.action;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

public class ChamadoActionTest {

	private ChamadoAction action;

	@Before
	public void setUp() throws Exception {
		action = new ChamadoAction();
	}
	
	@Test
	public void testNovo() throws Exception {
		assertEquals("novo", action.novo());
	}
	
	@Test
	public void testInserir() throws Exception {
		assertEquals(ActionSupport.SUCCESS, action.inserir());
	}
	
	@Test
	public void testPrepare() throws Exception {
		action.prepare();
		assertNotNull(action.getCategorias());
		assertFalse(action.getCategorias().isEmpty());
	}

}
