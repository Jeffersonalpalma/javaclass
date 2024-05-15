package br.com.etechoracio.livraria.model;

public class  Editora {
    public String nome;
    public String site;

    void exibir(){
        System.out.println("br.com.etechoracio.livraria.model.Editora: " + this.nome);
        System.out.println("site: " + this.site);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
