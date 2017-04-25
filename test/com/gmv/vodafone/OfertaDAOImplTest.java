package com.gmv.vodafone;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OfertaDAOImplTest {

	
	private OfertaDAO dao;
	@Before
	public void setUp() throws Exception {
		dao = new OfertaDAOImpl();
	}

	@Test
	public void test() throws OfertaException {
		List<Oferta> ofertas = dao.getOfertas();
		
		assertTrue(ofertas.size() == 2);
	}

	@Test
	public void test2() throws OfertaException {
		Oferta oferta = dao.getOferta(1); // le tengo que pasar un codigo pq lo indica el dao
		
		assertTrue(oferta != null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test3() throws OfertaException {
		dao.getOferta(5);
	}
}
