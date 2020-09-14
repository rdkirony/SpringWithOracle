package br.com.edeploy.bkofficeapi.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import br.com.edeploy.bkofficeapi.bean.CompleteWaste;



@Repository
public class CompleteWasteRepository{
	
	Connection con;
	
	@Autowired
	CompleteWasteInterface completeWasteInterface;
	
	public CompleteWasteRepository(DataSource dataSource) throws SQLException {
		con = dataSource.getConnection();
	}
	
	
	public CompleteWaste saveIntoDatabase(CompleteWaste completeWaste) throws SQLException {

		System.out.println(completeWaste.getDcDate());
        completeWasteInterface.save(completeWaste);
        
        return completeWaste;
	
	}


}
