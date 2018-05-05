package br.com.academiadev.banco.controller;

import br.com.academiadev.banco.dto.ClienteDTO;
import br.com.academiadev.banco.service.ClienteService;

public class ClienteController {

	public void cadastrar(ClienteDTO dto) {
		Cliente cliente = new Cliente();

		cliente.setCpf(dto.getCpf());
		// cliente.setDataCadastro(dto.getDataCadastro()); // CONVERTER STRING PARA
		cliente.setLogin(dto.getLogin());
		cliente.setNome(dto.getNome());
		cliente.setSenha(dto.getSenha());

		new ClienteService().cadastrar(cliente);
	}

}
