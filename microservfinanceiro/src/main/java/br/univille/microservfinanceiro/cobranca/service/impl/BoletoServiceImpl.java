package br.univille.microservfinanceiro.cobranca.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservfinanceiro.cobranca.entity.Boleto;
import br.univille.microservfinanceiro.cobranca.repository.BoletoRepository;
import br.univille.microservfinanceiro.cobranca.service.BoletoService;

@Service
public class BoletoServiceImpl implements BoletoService{

    @Autowired
    private BoletoRepository repository;

    @Override
    public List<Boleto> getAll() {
        var retornoIterador = repository.findAll();
        var listaBoletos = new ArrayList<Boleto>();

        retornoIterador.forEach(listaBoletos::add);
        return listaBoletos;
    }

    @Override
    public Boleto save(Boleto boleto) {
        return repository.save(boleto);
    }

}
