package com.swe1.game.Entity;

import java.util.UUID;

public class GameService {

	public enum GameServiceStatut{
		Signedin, Registred, Signetout 
	}
	private GameServiceStatut statut;
	private UUID gameServiceId = UUID.randomUUID();
	private String gameName;
	private String developerName;
	private String companyName;
	private GameMaster userId;
	private Registrierung registrierungId;
	
	
	public GameService(UUID gameServiceId, String gameName, String developerName, String companyName, GameServiceStatut statut){
		this.gameServiceId = gameServiceId;
		this.gameName = gameName;
		this.developerName = developerName;
		this.companyName = companyName;
		this.setStatut(statut);
		
	}


	public UUID getGameServiceId() {
		return gameServiceId;
	}


	public void setGameServiceId(UUID gameServiceId) {
		this.gameServiceId = gameServiceId;
	}


	public String getDeveloperName() {
		return developerName;
	}


	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public GameServiceStatut getStatut() {
		return statut;
	}


	public void setStatut(GameServiceStatut statut) {
		this.statut = statut;
	}
}
