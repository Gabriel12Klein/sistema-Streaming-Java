package pessoas;

import java.util.ArrayList;
import java.util.List;
import midias.Midia;

public class Espectador extends Pessoa {

    private List<Midia> favoritos;

    public Espectador(int id, String nome, String email) {
        
        super(id, nome, email);
        this.favoritos = new ArrayList<>();
        
    }
    
     // Adiciona uma mídia à lista de favoritas do espectador.
    public void adicionarFavorito(Midia midia) {
        favoritos.add(midia);
    }
    
     // Remove uma mídia da lista de favoritos.
    public void removerFavorito(Midia midia) {
        favoritos.remove(midia);
    }
    
     // Retorna todas as mídias favoritas do usuário.
    public List<Midia> getAllFavoritos() {
        return favoritos;
    }
}
