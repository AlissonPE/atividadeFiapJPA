package org.example.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private Professor professor;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "duracao")
    private int duracao;

    @Column(name = "dt_criacao", updatable = false, nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "dt_atualização")
    @UpdateTimestamp
    private LocalDateTime atualizadoEm;

    public Curso(Professor professor, String nome, int duracao, LocalDate dataCriacao) {
        this.professor = professor;
        this.nome = nome;
        this.duracao = duracao;
        this.dataCriacao = dataCriacao;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }
}
