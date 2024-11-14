package br.univille.microservfinanceiro.cobranca.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "boleto", autoCreateContainer = true)
public class Boleto {
    @Id
    @PartitionKey
    @GeneratedValue
    private String boletoId;
    private String nome;
    
    public String getBoletoId() {
        return boletoId;
    }
    public void setBoletoId(String id) {
        this.boletoId = id;
    }
    public String getBoletoNome() {
        return nome;
    }
    public void setBoletoNome(String nome) {
        this.nome = nome;
    }

}
