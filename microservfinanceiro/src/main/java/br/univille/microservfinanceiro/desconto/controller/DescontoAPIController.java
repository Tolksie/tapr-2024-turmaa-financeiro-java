package br.univille.microservfinanceiro.desconto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<Desconto>> get() {
        var listaDescontos = service.getAll();

        return new ResponseEntity<List<Desconto>>(listaDescontos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Desconto> post(@RequestBody Desconto desconto) {
        if (desconto == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var descontoSalvo = service.save(desconto);
        return new ResponseEntity<Desconto>(descontoSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Desconto> put(
            @PathVariable("id") String id,
            @RequestBody Desconto desconto) {
        if (desconto == null || id == "" || id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        desconto = service.update(id, desconto);
        if (desconto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Desconto>(desconto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Desconto> delete(
            @PathVariable("id") String id) {
        if (id == "" || id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var desconto = service.delete(id);
        if(desconto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Desconto>(desconto, HttpStatus.OK);
    }

}
