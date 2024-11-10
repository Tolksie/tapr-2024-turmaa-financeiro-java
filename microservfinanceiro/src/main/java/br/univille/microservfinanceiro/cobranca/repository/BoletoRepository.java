package br.univille.microservfinanceiro.cobranca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservfinanceiro.cobranca.entity.Boleto;

@Repository
public interface BoletoRepository
extends CrudRepository<Boleto,String> {
    
}
