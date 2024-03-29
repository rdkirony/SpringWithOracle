package br.com.edeploy.bkofficeapi.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.edeploy.bkofficeapi.repository.CompleteWasteRepository;

@RestController
public class CompleteWasteController {
	
	@Autowired
	CompleteWasteRepository repository;
	
	
	@PostMapping("/insertComplete")
	public Object insertIntoBD(@RequestBody String completeWaste) throws SQLException {
		return repository.saveCompleteIntoBD(completeWaste);
	}
}
