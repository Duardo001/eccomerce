package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;
import java.math.BigDecimal;
import br.com.fiap.ecommerce.model.Produto;

public class ProdutoRequestUpdateDto {
	private String nome;
	private BigDecimal valor;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
   
}
