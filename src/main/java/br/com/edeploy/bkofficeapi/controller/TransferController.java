package br.com.edeploy.bkofficeapi.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.edeploy.bkofficeapi.repository.TransferRepository;

@RestController
public class TransferController {

	@Autowired
	TransferRepository repository;

	@PostMapping("/insertTransfer")
	public Object insertIntoBD(@RequestBody String transferStore) throws SQLException {
		return repository.saveTransferIntoBD(transferStore);
	}

}
