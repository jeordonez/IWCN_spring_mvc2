package com.master.services;

//esqueleto
public interface ProductoService {
	Iterable<Producto> listaproductos();	
	Producto getproductoid(Integer codigo);	
	Producto guardarproducto(Producto prod);	
	void borrarproducto(Integer codigo);
}
