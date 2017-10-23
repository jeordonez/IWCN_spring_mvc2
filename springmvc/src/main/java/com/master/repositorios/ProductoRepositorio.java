package com.master.repositorios;

import org.springframework.data.repository.CrudRepository;
import com.master.services.Producto;

public interface ProductoRepositorio extends CrudRepository<Producto, Integer> {
}
