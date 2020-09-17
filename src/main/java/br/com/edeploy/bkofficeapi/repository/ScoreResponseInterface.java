package br.com.edeploy.bkofficeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edeploy.bkofficeapi.ws.bean.ScoreResponse;

public interface ScoreResponseInterface extends JpaRepository<ScoreResponse,String>{

}
