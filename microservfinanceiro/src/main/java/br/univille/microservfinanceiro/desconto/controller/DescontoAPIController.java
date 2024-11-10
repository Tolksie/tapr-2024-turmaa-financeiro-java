package br.univille.microservfinanceiro.desconto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservfinanceiro.desconto.entity.Desconto;
import br.univille.microservfinanceiro.desconto.service.DescontoService;

@RestController
@RequestMapping("/api/v1/descontos")
public class DescontoAPIController {

    @Autowired
    private DescontoService service;
    
    @GetMapping
    public ResponseEntity<List<Desconto>> get(){
        var listaDescontos = service.getAll();

        return new ResponseEntity<List<Desconto>>(listaDescontos, HttpStatus.OK);
    }
}
