package br.com.academiadev.banco.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.com.academiadev.banco.controller.Cliente;

public class Conta {

	private Long id;
	private Gerente gerente;
	private Agencia agencia;

	private Integer numero;

	private BigDecimal saldo;
	private LocalDate dataAbertura;

	private boolean ativo;

	private TipoStatus status;

	private Cliente cliente;
}
