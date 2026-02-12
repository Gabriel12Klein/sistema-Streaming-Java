package estudios;

import java.util.ArrayList;
import java.util.List;
import midias.Midia;

public class Estudio {

    private int id;
    private String nome;
    private List<Midia> publicacoes;

    public Estudio(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }
    
    // Adiciona uma mídia produzida pelo estúdio ao catálogo interno.
    public void publicar(Midia midia) {
        publicacoes.add(midia);
    }
    
    // Retorna uma lista das mídias já publicadas pelo estúdio.
    public List<Midia> getPublicacoes() {
        return publicacoes;
    }

    // GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
