package br.com.edeploy.bkofficeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edeploy.bkofficeapi.bean.TransferStore;

public interface TransferInterface extends JpaRepository<TransferStore,String>{

}
