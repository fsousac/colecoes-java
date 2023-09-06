package java.exercises;

import java.util.Comparator;

public class LivrosOrganizados implements Comparable<LivrosOrganizados>{
    private String titulo;
    private String autor;
    private int ano;

    @Override
    public int compareTo(LivrosOrganizados l) {
        return titulo.compareTo(l.titulo);
    }
    public LivrosOrganizados(String nome, String autor, int ano) {
        this.titulo = nome;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

class CompararAutor implements Comparator<LivrosOrganizados>{
    public int compare(LivrosOrganizados l1, LivrosOrganizados l2){
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
class CompararAno implements Comparator<LivrosOrganizados>{
    public int compare(LivrosOrganizados l1, LivrosOrganizados l2){
        if (l1.getAno() < l2.getAno())
            return -1;
        if (l1.getAno() > l2.getAno())
            return 1;
        else
            return 0;
    }
}


class CompararAnoAutorTitulo implements Comparator<LivrosOrganizados>{
    @Override
    public int compare(LivrosOrganizados l1, LivrosOrganizados l2){
        int ano = Integer.compare(l1.getAno(),l2.getAno());
        if (ano != 0)
            return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0)
            return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
