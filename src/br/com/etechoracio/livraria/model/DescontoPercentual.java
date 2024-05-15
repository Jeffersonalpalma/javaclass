package br.com.etechoracio.livraria.model;

public class DescontoPercentual implements Desconto{
    private double percentual;

    @Override
    public double aplicar(double preco) {

        return 0;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    public DescontoPercentual(double percentual){
        new DescontoPercentual(0.15);

    }
}
