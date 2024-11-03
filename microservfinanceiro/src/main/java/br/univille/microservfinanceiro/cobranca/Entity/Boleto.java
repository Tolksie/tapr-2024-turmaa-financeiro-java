package br.univille.microservfinanceiro.cobranca.Entity;

import java.util.Date;
import java.util.UUID;

public class Boleto {
    private UUID boletoId;
    private Float valorBoleto;
    private UUID cursoId;
    private Date dataBoleto;
    private Date vencimentoBoleto;
    private UUID alunoId;
    private String status; 


}
