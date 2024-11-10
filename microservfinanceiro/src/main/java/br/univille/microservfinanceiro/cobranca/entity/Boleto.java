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
    private String boletoNome;
    
    public String getBoletoId() {
        return boletoId;
    }
    public void setBoletoId(String boletoId) {
        this.boletoId = boletoId;
    }
    public String getBoletoNome() {
        return boletoNome;
    }
    public void setBoletoNome(String boletoNome) {
        this.boletoNome = boletoNome;
    }

}
