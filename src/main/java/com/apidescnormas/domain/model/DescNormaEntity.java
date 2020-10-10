package com.apidescnormas.domain.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="desc_norma", schema = "bdnorma")
public class DescNormaEntity {
	
	@Id
	@Column(name="codigo_norma")
	private String codigo_norma;
	
	@Column(name="codigo_secundario")
	private String codigo_secundario;
	
	@Column(name="dt_ini_valid")
	private OffsetDateTime dt_ini_valid;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="titulo_idi_sec")
	private String titulo_idi_sec;
	
	@Column(name="nota_titulo")
	private String nota_titulo;
	
	@Column(name="comite")
	private String comite;
	
	@Column(name="num_pag")
	private int num_pag;
	
	@Column(name="objetivo")
	private String objetivo;
	

}
