package br.com.edeploy.bkofficeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edeploy.bkofficeapi.bean.Invoice;

public interface InvoiceInterface extends JpaRepository<Invoice,String>{

}
