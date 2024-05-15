package br.com.etechoracio.livraria.model;

public class DescontoFixo implements Desconto {
    private double valor;

    @Override
    public double aplicar(double preco) {
        preco=getValor()-DescontoFixo(double valor)
        return preco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public DescontoFixo(double valor){
        valor=10;

    }
}
