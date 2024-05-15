package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapa;

public class LivroImpresso extends Livro{
    private TipoCapa tipocapa;

    public LivroImpresso() {
        tipocapa = TipoCapa.COMUM;
        cobracapa();
    }
    public TipoCapa getTipocapa() {
        return tipocapa;
    }

    public void setTipoCapa(TipoCapa tipocapa) {
        this.tipocapa = tipocapa;
    }

    public void cobracapa() {
        if (tipocapa.equals(TipoCapa.DURA)) {
            valor = valor += 5;
        } else if (tipocapa == TipoCapa.PERSONALIZADA) {
            valor = valor += 10;
        }
    }

    @Override
    protected void detalhar() {
        System.out.println("Tipo de capa:" + tipocapa);
        System.out.println("Taxa de envio:" + formatarvalor(gettaxaenvio()));
    }
}
