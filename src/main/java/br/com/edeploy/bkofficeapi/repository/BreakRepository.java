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

import br.com.edeploy.bkofficeapi.bean.BreakRequest;
@Repository
public class BreakRepository {
	final Logger logger = LoggerFactory.getLogger(BreakRepository.class);
	Connection con;
	@Autowired
	BreakInterface breakInterface;

	public BreakRepository(DataSource dataSource) throws SQLException {
		con = dataSource.getConnection();
	}

	public Object saveBreakIntoBD(String jsonFile) throws SQLException {

		logger.info(jsonFile);
		Gson gson = new Gson();
		JsonElement jsonElement = gson.fromJson(jsonFile, JsonElement.class);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		BreakRequest object = gson.fromJson(jsonObject, BreakRequest.class);
		breakInterface.save(object);
		return object;

	}
}
