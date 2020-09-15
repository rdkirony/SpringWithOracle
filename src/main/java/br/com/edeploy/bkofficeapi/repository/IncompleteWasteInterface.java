package br.com.edeploy.bkofficeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edeploy.bkofficeapi.bean.IncompleteWaste;

public interface IncompleteWasteInterface extends JpaRepository<IncompleteWaste,String> {

}
