package filadeBanco;

import javax.swing.JOptionPane;
 
// @author Cristiano Rocha Feitoza
 
public class Pessoa {
    private String nome,cpf, tipo;
    private int idade,senha;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade, int senha,String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.senha = senha;
        this.tipo = tipo;
    }
 
    public String toString(int n) {
        return n+"."+"Nome: " + nome + " CPF: " + cpf + " Idade : " + idade +" Senha : " + senha +" " + tipo +"\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
} 

