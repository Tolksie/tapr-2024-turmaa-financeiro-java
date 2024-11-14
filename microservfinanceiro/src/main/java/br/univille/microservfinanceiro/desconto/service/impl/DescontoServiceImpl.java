package br.univille.microservfinanceiro.desconto.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservfinanceiro.desconto.entity.Desconto;
import br.univille.microservfinanceiro.desconto.respository.DescontoRepository;
import br.univille.microservfinanceiro.desconto.service.DescontoService;

@Service
public class DescontoServiceImpl implements DescontoService{

    @Autowired
    private DescontoRepository repository;

    @Override
    public List<Desconto> getAll() {
        var retornoIterador = repository.findAll();
        var listaDescontos = new ArrayList<Desconto>();

        retornoIterador.forEach(listaDescontos::add);
        return listaDescontos;
    }

    @Override
    public Desconto save(Desconto desconto) {
        return repository.save(desconto);
    }

    @Override
    public Desconto update(String id, Desconto desconto) {
        var buscaDesconto = repository.findById(id);
        if(buscaDesconto.isPresent()){
            var descontoAntigo = buscaDesconto.get();
            //atualizo os atributos
            descontoAntigo.setNome(id);
            repository.save(descontoAntigo);
            return descontoAntigo;
        }
        return null;
    }
    @Override
    public Desconto delete(String id) {
        var buscaDesconto = repository.findById(id);
        if(buscaDesconto.isPresent()){
            var descontoAntigo = buscaDesconto.get();
            repository.delete(descontoAntigo);
            return descontoAntigo;
    }
    return null;
}
    
}
