package br.com.academiadev.banco.service;

import br.com.academiadev.banco.controller.Cliente;
import br.com.academiadev.banco.session.Session;

public class ClienteService {

	public void cadastrar(Cliente cliente) {
		cliente.setId(1l);

		Session.getClientes().add(cliente);
	}

}
