package com.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.productos.models.entities.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
