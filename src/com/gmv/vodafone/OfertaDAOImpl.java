package com.gmv.vodafone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OfertaDAOImpl implements OfertaDAO {

	// No usamos entity manager porque no vamos a consultar ninguna bbdd, estamos simulando.
	
	private static List<Oferta> ofertas = new ArrayList<>();
	
	static { // para que lea solo una vez los datos
		Oferta of1 = new Oferta();
		of1.setCodigoOferta(1);
		of1.setReferencia("LIJA553");
		of1.setFechaInicio(LocalDate.of(2017, 5, 1));
		ofertas.add(of1);
		
		Oferta of2 = new Oferta();
		of2.setCodigoOferta(2);
		of2.setReferencia("FIB300");
		of2.setFechaInicio(LocalDate.of(2017, 5, 16));
		ofertas.add(of2);
	}
	
	
	@Override
	public List<Oferta> getOfertas() throws OfertaException {
		
		
		return ofertas;
	}

	@Override
	public Oferta getOferta(int codigoOferta) throws OfertaException {
		for(Oferta oferta : ofertas) {
			if(oferta.getCodigoOferta()==codigoOferta) {
				return oferta;
			}
		}
		throw new IllegalArgumentException();
	}

}
