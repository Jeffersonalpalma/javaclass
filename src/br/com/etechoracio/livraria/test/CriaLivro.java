package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.model.*;
import br.com.etechoracio.livraria.enums.TipoCapa;

public class CriaLivro {
    public static void main(String[] args) {
        //DescontoFixo oi= new DescontoPercentual();




        Editora rocco = new Editora();
        rocco.nome = "Rocco";
        rocco.site = "rocco.com.br";
        LivroImpresso primeirolivro = new LivroImpresso();
        primeirolivro.setTitulo("Harry Poter");
        primeirolivro.setAutor("J.K. Rowling");
        primeirolivro.setEditora(rocco);
        primeirolivro.setTipoCapa(TipoCapa.PERSONALIZADA);
        primeirolivro.setValor(45.00);
        primeirolivro.setPaginas(306);
        primeirolivro.setSinopse("Percy Jackson & the Olympians é uma série literária composta por cinco livros de aventura,romance, suspense e fantasia, escritos pelo estadunidense Rick Riordan, que retrata a mitologia grega no século XXI.");
        primeirolivro.cobracapa();
        primeirolivro.desconto(0.2);
        primeirolivro.exibir();

        LivroImpresso segundolivro = new LivroImpresso();
        segundolivro.setTitulo("Percy Jackson")  ;
        segundolivro.setAutor("Rick Riordan") ;
        segundolivro.setEditora( rocco) ;
        segundolivro.setTipoCapa(TipoCapa.DURA);
        segundolivro.setValor(56.00) ;
        segundolivro.setPaginas(306);
        segundolivro.cobracapa();
        segundolivro.desconto(0.2);
        segundolivro.exibir();

        Kindle terceirolivro=new Kindle();
        terceirolivro.setTitulo("Harry Poter");
        terceirolivro.setAutor("J.K. Rowling");
        terceirolivro.setEditora(rocco);
        terceirolivro.setValor(45.00);
        terceirolivro.setPaginas(306);
        terceirolivro.desconto(0.2);
        terceirolivro.exibir();

        SacolaCompras sacola2304 = new SacolaCompras();
        sacola2304.adicionar(primeirolivro);
        sacola2304.adicionar(segundolivro);
        sacola2304.adicionar(terceirolivro);


        Revista primeirarevista=new Revista();
        primeirarevista.setTitulo("AAAAAAAAAAAAAAAAAAAAA");
        primeirarevista.setValor(15.99);
        sacola2304.adicionar(primeirarevista);

    }
}
