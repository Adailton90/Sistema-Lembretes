package com.example.lembretes.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class LembreteEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codigo")
	private Long codigo;
	
	@NotEmpty(message="O Título é obrigatório.")
	@NotBlank(message="O Título é obrigatório.")
	@Column(nullable=false, length = 255)
	private String titulo;
	
	@Column(name="descricao", length = 255)
	private String descricao;
	
	@NotNull(message="A data do lembrete é obrigatório.")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="data_lembrete",nullable=false)
	private Date data_lembrete;
	
	

	public LembreteEntity() {
		
	}

	public LembreteEntity(Long codigo, String titulo, String descricao, Date data_lembrete) {
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.data_lembrete = data_lembrete;
	}

	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_lembrete() {
		return data_lembrete;
	}

	public void setData_lembrete(Date data_lembrete) {
		this.data_lembrete = data_lembrete;
	}
	
	
	
	
}
