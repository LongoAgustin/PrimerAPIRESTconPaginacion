package com.example.demo.controllers;

import com.example.demo.entities.Localidad;
import com.example.demo.entities.Persona;
import com.example.demo.service.LocalidadServiceImpl;
import com.example.demo.service.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{



}
