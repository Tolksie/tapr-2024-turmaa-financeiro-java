package br.univille.microservfinanceiro.desconto.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "desconto", autoCreateContainer = true)
public class Desconto {
    @Id
    @PartitionKey
    @GeneratedValue
    private String Id;
    private String Nome;

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    
}