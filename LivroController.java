package Controller;

import Model.LivroModel;
import javax.swing.JOptionPane;

public class LivroController {
    public void cadastrarLivroController(String titulo, String genero, int npaginas, String sinopse, String autornome, String autornacio){
        String numerop = Integer.toString(npaginas);
        if((titulo != null && titulo.length() > 0) && 
           (genero != null && genero.length() > 0) && 
           (numerop != null && numerop.length() > 0) && 
           (sinopse != null && sinopse.length() > 0) && 
           (autornome != null && autornome.length() > 0) && 
           (autornacio != null && autornacio.length() > 0)){
            LivroModel novoLivro = new LivroModel(titulo, genero, npaginas, sinopse, autornome, autornacio);
            JOptionPane.showMessageDialog(null, "Dados registrados com sucesso!");
            JOptionPane.showMessageDialog(null, "Objeto criado com sucesso!");
            novoLivro.cadastrarLivroDAO(novoLivro);
        }else{
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }
    }
}