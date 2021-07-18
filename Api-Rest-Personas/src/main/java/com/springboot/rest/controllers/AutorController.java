package com.springboot.rest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entities.Autor;
import com.springboot.rest.services.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
