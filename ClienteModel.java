package Model;

import DAO.ClienteBancoDados;
import java.time.LocalDate;

public class ClienteModel {

    int id;
    String nome;
    String cpf;
    String telefone;
    String endereco;
    LocalDate dataderegistro;

    public ClienteModel() {
    }

    public ClienteModel(String nome, String cpf, String telefone, String endereco, LocalDate dataderegistro) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataderegistro = dataderegistro;
    }

    public ClienteModel(int id, String nome, String cpf, String telefone, String endereco, LocalDate dataderegistro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataderegistro = dataderegistro;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataderegistro() {
        return dataderegistro;
    }

    public void setDataderegistro(LocalDate dataderegistro) {
        this.dataderegistro = dataderegistro;
    }
    
    public void cadastrarClienteDAO(ClienteModel cliente){
        ClienteBancoDados novoCliente = new ClienteBancoDados();
        novoCliente.inserirClienteBD(cliente);
    }
}