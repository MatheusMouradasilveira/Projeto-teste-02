package Controller;

import Model.ClienteModel;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class ClienteController {
    public void cadastrarClienteController(String nome, String cpf, String telefone, String endereco, LocalDate dataderegistro){
        String registrodata = dataderegistro.toString();
        if((nome != null && nome.length() > 0) && 
           (cpf != null && cpf.length() > 0) && 
           (telefone != null && telefone.length() > 0) && 
           (endereco != null && endereco.length() > 0) && 
           (registrodata != null && registrodata.length() > 0)){
            ClienteModel novoCliente = new ClienteModel(nome, cpf, telefone, endereco, dataderegistro);
            JOptionPane.showMessageDialog(null, "Dados registrados com sucesso!");
            JOptionPane.showMessageDialog(null, "Objeto criado com sucesso!");
            novoCliente.cadastrarClienteDAO(novoCliente);
        }else{
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente");
        }
    }
}