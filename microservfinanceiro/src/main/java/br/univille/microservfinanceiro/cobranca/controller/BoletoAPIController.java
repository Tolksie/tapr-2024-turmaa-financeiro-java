package br.univille.microservfinanceiro.cobranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservfinanceiro.cobranca.entity.Boleto;
import br.univille.microservfinanceiro.cobranca.service.BoletoService;

@RestController
@RequestMapping("/api/v1/boletos")
public class BoletoAPIController {

    @Autowired
    private BoletoService service;

    @GetMapping
    public ResponseEntity<List<Boleto>> get(){
        var listaBoletos = service.getAll();

        return new ResponseEntity<List<Boleto>>(listaBoletos, HttpStatus.OK);
    }
    
}
