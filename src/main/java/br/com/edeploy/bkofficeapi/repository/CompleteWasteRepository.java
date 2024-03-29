package br.com.edeploy.bkofficeapi.repository;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import br.com.edeploy.bkofficeapi.bean.CompleteWaste;

@Repository
public class CompleteWasteRepository {
	final Logger logger = LoggerFactory.getLogger(CompleteWasteRepository.class);
	Connection con;
	@Autowired
	CompleteWasteInterface completeWasteInteface;

	public CompleteWasteRepository(DataSource dataSource) throws SQLException {
		con = dataSource.getConnection();
	}

	public Object saveCompleteIntoBD(String jsonFile) throws SQLException {

		logger.info(jsonFile);
		Gson gson = new Gson();
		JsonElement jsonElement = gson.fromJson(jsonFile, JsonElement.class);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		CompleteWaste object = gson.fromJson(jsonObject, CompleteWaste.class);
		completeWasteInteface.save(object);
		return object;

	}

}
