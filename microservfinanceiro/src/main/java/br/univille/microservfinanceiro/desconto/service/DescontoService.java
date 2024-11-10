package br.univille.microservfinanceiro.desconto.service;

import java.util.List;

import br.univille.microservfinanceiro.desconto.entity.Desconto;

public interface DescontoService {
    List<Desconto> getAll();
    Desconto save(Desconto desconto);
}

