package com.dbcont.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.dbcont.api.enums.PerfilEnum;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 6916354691298061300L;
	
	private long id;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private BigDecimal valorHora;
	private Float qtdHorasTrbalhoDia;
	private Float qtdHorasAlmoco;
	private PerfilEnum perfil;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private Empresa empresa;
	private transient List<Lancamento> lancamentos;
	
	public Funcionario() {
	}
	
	

}
