package com.gmv.vodafone;

import java.time.LocalDate;
import java.util.List;

public interface OfertaDAO {
	
	List<Oferta> getOfertas() throws OfertaException;
	
	Oferta getOferta(int codigoOferta) throws OfertaException;
	
	LocalDate getOfertaByDate(int codigoOferta);

}
