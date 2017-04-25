package com.gmv.vodafone;

import java.util.List;

public interface OfertaDAO {
	
	List<Oferta> getOfertas();
	
	Oferta getOferta(int codigoOferta);

}
