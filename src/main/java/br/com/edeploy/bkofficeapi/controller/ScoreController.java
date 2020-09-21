package br.com.edeploy.bkofficeapi.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.edeploy.bkofficeapi.repository.ScoreResponseRepository;

@RestController
public class ScoreController {

	@Autowired
	ScoreResponseRepository repository;
	
	@PostMapping("/insertScore")
	public Object insertIntoBD(@RequestBody String scoreResponse) throws SQLException {
		return repository.saveRequestIntoBD(scoreResponse);
	}
}
