/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.modelo;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tarle
 */
public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private Integer classificacao;
    private Calendar criadoEm;
    
    private Endereco endereco;
    
    private List<Item> vendas;
    
    private List<FormaPagamento> formasPagamento;

    public Usuario() {
    }
   
    public Usuario(Integer id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        
        this.criadoEm = Calendar.getInstance();
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", classificacao=" + classificacao + ", criadoEm=" + criadoEm + '}';
    }
    
    public void adicionarEndereco(String logradouro, String cep, String numero, String cidade) {
        if(endereco == null) {
            endereco = new Endereco();
        }
        
        getEndereco().setLogradouro(logradouro);
        getEndereco().setCep(cep);
        getEndereco().setCidade(cidade);
        getEndereco().setNumero(numero);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Item> getVendas() {
        return vendas;
    }

    public void setVendas(List<Item> vendas) {
        this.vendas = vendas;
    }

    public List<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
        this.formasPagamento = formasPagamento;
    }
    
    
    private class Endereco {
        private String logradouro;
        private String cep;
        private String numero;
        private String cidade;

        public Endereco() {
            
        }
        
        public Endereco(String logradouro, String cep, String numero, String cidade) {
            this.logradouro = logradouro;
            this.cep = cep;
            this.numero = numero;
            this.cidade = cidade;
        }
        
        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 67 * hash + Objects.hashCode(this.cep);
            hash = 67 * hash + Objects.hashCode(this.numero);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Endereco other = (Endereco) obj;
            if (!Objects.equals(this.cep, other.cep)) {
                return false;
            }
            if (!Objects.equals(this.numero, other.numero)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Endereco{" + "logradouro=" + logradouro + ", cep=" + cep + ", numero=" + numero + ", cidade=" + cidade + '}';
        }
    }
}
