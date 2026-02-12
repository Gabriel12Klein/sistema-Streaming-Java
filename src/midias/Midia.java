package midias;

import java.util.ArrayList;
import java.util.List;

public class Midia {

    protected int id;
    protected String titulo;
    protected int ano;
    protected String genero;
    protected int duracao;
    protected List<Integer> avaliacoes;

    public Midia(int id, String titulo, int ano, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.duracao = duracao;
        this.avaliacoes = new ArrayList<>();
    }
    
    // Adiciona uma nova nota à lista de avaliações da mídia.
    public void avaliar(int nota) {
        avaliacoes.add(nota);
    }
    
    // Calcula e retorna a média das avaliações.
    public float getAvaliacao() {
        if (avaliacoes.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for (int n : avaliacoes) {
            soma += n;
        }
        return soma / (float) avaliacoes.size();
    }

    // GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
