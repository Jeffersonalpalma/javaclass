package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapa;

public abstract class Livro implements Exemplar{
    private String titulo;
    private String sinopse;
    protected double valor;
    private String autor;
    private Editora editora;
    private int paginas;
    private double total;

    public void exibir(){

        System.out.println("--------------------");
        System.out.println("Detalhes do livro");
        System.out.println("--------------------");
        System.out.println("Título:" + getTitulo());
        System.out.println("Resumo:" + getSinopse());
        System.out.println("Valor:" + formatarvalor(valor));
        System.out.println("Autor:" + getAutor());
       // System.out.println("Tipo de capa:" + tipocapa);
        System.out.println("Quantidade de páginas:" + getPaginas());
        detalhar();
        editora.exibir();
       // System.out.println("Taxa de envio:" + formatarvalor(gettaxaenvio()));
        System.out.println("Valor total da compra:" + formatarvalor(valortotal(total)));
    }

    double gettaxaenvio(){
        return valor * 0.05;
    }
    String formatarvalor(double param){
        return String.format("R$ %.2f", param);
    }
    double desconto(){
        return valor * 0.15;
    }
    double valortotal(double total){
        return valor + gettaxaenvio() - desconto();
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo ="Harry Potter";
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = 45.00;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }



    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {

        this.paginas = paginas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public void desconto(double percentual){
        if (percentual >0.1){
            System.out.println("desconto nao pode ser maior que 10%");
        }else{
            valor=valor-valor*percentual;
        }
    }
    protected abstract void detalhar();



}
