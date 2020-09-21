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

import br.com.edeploy.bkofficeapi.bean.TransferStore;



@Repository
public class TransferRepository {
	final Logger logger = LoggerFactory.getLogger(TransferRepository.class);
	Connection con;
	@Autowired
	TransferInterface transferInterface;

	public TransferRepository(DataSource dataSource) throws SQLException {
		con = dataSource.getConnection();
	}

	public Object saveTransferIntoBD(String jsonFile) throws SQLException {

		logger.info(jsonFile);
		Gson gson = new Gson();
		JsonElement jsonElement = gson.fromJson(jsonFile, JsonElement.class);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		TransferStore object = gson.fromJson(jsonObject, TransferStore.class);
		transferInterface.save(object);
		return object;

	}
}
