package com.example.demo.service;

import com.example.demo.entities.Persona;
import org.springframework.data.domain.*;


import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
