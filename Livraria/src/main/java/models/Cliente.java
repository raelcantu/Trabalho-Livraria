/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

public class Cliente {

    private String nome;
    private String cpf;
    private String numTelefone;
    private Endereco enderecoCliente;

    public Cliente(String nome, String cpf, String numTelefone, Endereco enderecoCliente) {
        this.nome = nome;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
        this.enderecoCliente = enderecoCliente;
    }
    
    
    public Cliente(){
        
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

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    @Override
    public String toString() {
        return "{" + "nome=" + nome + ", cpf=" + cpf + ", numTelefone=" + numTelefone + ", enderecoCliente=" + enderecoCliente + '}';
    }
    
    
    
}
