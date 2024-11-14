package br.univille.microservfinanceiro.cobranca.service;

import java.util.List;

import br.univille.microservfinanceiro.cobranca.entity.Boleto;

public interface BoletoService {
    List<Boleto> getAll();
    Boleto save(Boleto boleto);
    Boleto update(String id, Boleto boleto);
    Boleto delete(String id);
}
