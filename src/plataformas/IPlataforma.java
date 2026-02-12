package plataformas;

import midias.Midia;

public interface IPlataforma {
    //Método responsável por adicionar uma nova mídia ao catálogo da plataforma.
    void adicionarMidia(Midia midia);

     // Busca e retorna uma mídia pelo seu título. 
    // Caso não exista, o método deve retornar null.
    Midia buscarPorTitulo(String titulo);
    
    
}
