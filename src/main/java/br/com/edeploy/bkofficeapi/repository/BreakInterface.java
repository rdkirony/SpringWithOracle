package br.com.edeploy.bkofficeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edeploy.bkofficeapi.bean.BreakRequest;

public interface BreakInterface extends JpaRepository<BreakRequest,String>{

}
