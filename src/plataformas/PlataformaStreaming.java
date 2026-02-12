package plataformas;

import java.util.ArrayList;
import java.util.List;
import midias.Midia;
import pessoas.Criador;
import pessoas.Espectador;

public class PlataformaStreaming implements IPlataforma {

    private String nome;
    private List<Midia> catalogo;
    private List<Criador> criadores;
    private List<Espectador> espectadores;

    public PlataformaStreaming(String nome) {
        this.nome = nome;
        this.catalogo = new ArrayList<>();
        this.criadores = new ArrayList<>();
        this.espectadores = new ArrayList<>();
    }

    @Override
    public void adicionarMidia(Midia midia) {
        catalogo.add(midia);
    }

    @Override
    public Midia buscarPorTitulo(String titulo) {
        for (Midia m : catalogo) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }

    public List<Midia> buscarMidiasPorGenero(String genero) {
        List<Midia> result = new ArrayList<>();
        for (Midia m : catalogo) {
            if (m.getGenero().equalsIgnoreCase(genero)) {
                result.add(m);
            }
        }
        return result;
    }

    public void registrarCriador(Criador criador) {
        criadores.add(criador);
    }

    public List<Criador> getCriadores() {
        return criadores;
    }

    public void registrarEspectador(Espectador espectador) {
        espectadores.add(espectador);
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public List<Midia> getCatalogo() {
        return catalogo;
    }

    // GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
