package org.example.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor")
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "formacao", length = 50)
    private String formacao;

    @Column(name = "dt_nascimento")
    private LocalDate dataNascimento;

    @CreationTimestamp
    @Column(name = "dt_cadastro")
    private Timestamp cadastro_plataforma;

    @Deprecated
    public Professor() {
    }

    public Professor(String nome, String formacao, LocalDate dataNascimento) {
        this.nome = nome;
        this.formacao = formacao;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public LocalDate getData() {
        return dataNascimento;
    }

    public void setData(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Timestamp getCadastro_plataforma() {
        return cadastro_plataforma;
    }

    public void setCadastro_plataforma(Timestamp cadastro_plataforma) {
        this.cadastro_plataforma = cadastro_plataforma;
    }
}
