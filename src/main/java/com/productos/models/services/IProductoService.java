package com.productos.models.services;

import java.util.List;

import com.productos.models.entities.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	
}
