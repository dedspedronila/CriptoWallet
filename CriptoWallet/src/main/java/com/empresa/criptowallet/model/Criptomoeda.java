
package com.empresa.criptowallet.model;

//Andre
import java.math.BigDecimal; //Usamos para valores que mexem com dinheiro, para evitar erros de ponto flutuante.

public class Criptomoeda {
    private String simbolo; //A sigla da criptomoeda.
    private String nome; //Nome da sigla da criptomoeda.
    private BigDecimal cotacaoBRL; //a cotacao atual em BRL
    private BigDecimal cotacaoUSD; //a cotacao atual em USD
    
    public Criptomoeda(String simbolo, String nome){
        this.simbolo = simbolo;
        this.nome = nome;
        this.cotacaoBRL = cotacaoBRL;
        this.cotacaoUSD = cotacaoUSD;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getCotacaoBRL() {
        return cotacaoBRL;
    }

    public void setCotacaoBRL(BigDecimal cotacaoBRL) {
        this.cotacaoBRL = cotacaoBRL;
    }

    public BigDecimal getCotacaoUSD() {
        return cotacaoUSD;
    }

    public void setCotacaoUSD(BigDecimal cotacaoUSD) {
        this.cotacaoUSD = cotacaoUSD;
    }
}
