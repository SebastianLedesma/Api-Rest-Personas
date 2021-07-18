package com.springboot.rest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entities.Localidad;
import com.springboot.rest.services.LocalidadServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}
