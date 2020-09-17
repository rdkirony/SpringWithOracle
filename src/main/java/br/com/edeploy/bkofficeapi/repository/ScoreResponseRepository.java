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

import br.com.edeploy.bkofficeapi.ws.bean.ScoreResponse;

@Repository
public class ScoreResponseRepository {
	final Logger logger = LoggerFactory.getLogger(ScoreResponseRepository.class);
	Connection con;
	@Autowired
	ScoreResponseInterface scoreInterface;

	public ScoreResponseRepository(DataSource dataSource) throws SQLException {
		con = dataSource.getConnection();
	}

	public Object saveRequestIntoBD(String jsonFile) throws SQLException {

		logger.info(jsonFile);
		Gson gson = new Gson();
		JsonElement jsonElement = gson.fromJson(jsonFile, JsonElement.class);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		ScoreResponse object = gson.fromJson(jsonObject, ScoreResponse.class);
		scoreInterface.save(object);
		return object;

	}
}
