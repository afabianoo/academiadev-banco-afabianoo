package br.com.academiadev.banco.session;

import java.util.ArrayList;
import java.util.List;

import br.com.academiadev.banco.controller.Cliente;
import br.com.academiadev.banco.model.Agencia;
import br.com.academiadev.banco.model.Gerente;

public class Session {

	private static Cliente clienteLogado;
	private static Agencia agenciaLogada;

	private static final List<Cliente> clientes = new ArrayList<>();

	public static void iniciaSession() {
		Agencia agencia = new Agencia();

		Gerente gerente = new Gerente();
		agencia.setGerente(gerente);

		gerente.setAgencia(agencia);

		Session.agenciaLogada = agencia;

		Session.getClientes().add(gerente);
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static Cliente getClienteLogado() {
		return clienteLogado;
	}

	public static void setClienteLogado(Cliente clienteLogado) {
		Session.clienteLogado = clienteLogado;
	}

	public static Agencia getAgenciaLogada() {
		return agenciaLogada;
	}

	public static void setAgenciaLogada(Agencia agenciaLogada) {
		Session.agenciaLogada = agenciaLogada;
	}

}
