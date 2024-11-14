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

    @Override
    public Boleto update(String id, Boleto boleto) {
        var buscaBoleto = repository.findById(id);
        if(buscaBoleto.isPresent()){
            var boletoAntigo = buscaBoleto.get();
            //atualizo os atributos
            boletoAntigo.setBoletoNome(id);
            repository.save(boletoAntigo);
            return boletoAntigo;
        }
        return null;
    }

    @Override
    public Boleto delete(String id) {
        var buscaBoleto = repository.findById(id);
        if(buscaBoleto.isPresent()){
            var boletoAntigo = buscaBoleto.get();
            repository.delete(boletoAntigo);
            return boletoAntigo;
    }
    return null;
    }
}
