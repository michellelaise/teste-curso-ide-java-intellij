package br.com;

import br.com.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Demonio");
        Gato gato1 = new Gato("","",1);
        System.out.println(gato);
        System.out.println(gato.getNome());
        System.out.println(gato1);

       /* Livro livro1 = new Livro( "O problema dos 3 corpos",  300);
        System.out.println(livro1);*/
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String name;
    private Integer numPagina;

    public Livro(String name, Integer numPagina) {
        this.name = name;
        this.numPagina = numPagina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }

    public static Integer  bhfgfgf() {
        return 1;
    }
}