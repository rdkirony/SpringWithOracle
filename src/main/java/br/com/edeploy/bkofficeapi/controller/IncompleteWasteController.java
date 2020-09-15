package br.com.edeploy.bkofficeapi.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.edeploy.bkofficeapi.repository.IncompleteWasteRepository;

@RestController
public class IncompleteWasteController {
	
	@Autowired
	IncompleteWasteRepository repository;
	
	@PostMapping("/insertIncomplete")
	public Object insertIntoBD(@RequestBody String incompleteWaste) throws SQLException {
		return repository.saveIncompleteIntoBD(incompleteWaste);
	}
}
