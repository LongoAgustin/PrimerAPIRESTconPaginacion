package com.example.demo.service;

import com.example.demo.entities.Base;

import org.springframework.data.domain.*;


import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable>{

    public List<E> findAll() throws Exception; //nos trae la lista de las personas en la base de datos

    public Page<E> findAll(Pageable pageable) throws Exception;

    public E findById(ID id) throws Exception;//nos trae una identidad segun el id

    public E save(E entity) throws Exception;//crea una nueva entidad

    public E update(ID id, E entity) throws Exception;//actualizar la entidad

    public boolean delete(ID id) throws Exception;//eliminar el registro de la base de datos

}
