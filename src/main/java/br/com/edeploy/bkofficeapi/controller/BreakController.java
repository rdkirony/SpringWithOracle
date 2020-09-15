package br.com.edeploy.bkofficeapi.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.edeploy.bkofficeapi.repository.BreakRepository;


@RestController
public class BreakController {
	
	@Autowired
	BreakRepository repository;
	
	@PostMapping("/insertBreak")
	public Object insertIntoBD(@RequestBody String breakBody) throws SQLException {
		return repository.saveBreakIntoBD(breakBody);
	}
}
