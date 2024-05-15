package br.com.etechoracio.livraria.model;

public class Kindle extends Livro{

    public String getMarcadagua() {
        return marcadagua;
    }

    public void setMarcadagua(String marcadagua) {
        this.marcadagua = marcadagua;
    }
    @Override
    public void desconto(double percentual){
        if (percentual >0.1){
            System.out.println("desconto nao pode ser maior que 10%");
        }else{
            valor=valor-valor*percentual;
        }
    }

    @Override
    protected void detalhar() {
        System.out.println("Marca d´agua: "+ getMarcadagua());
    }

    private String marcadagua;
}
