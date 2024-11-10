package br.univille.microservfinanceiro.desconto.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservfinanceiro.desconto.entity.Desconto;

@Repository
public interface DescontoRepository
extends CrudRepository<Desconto,String> {
    
}
