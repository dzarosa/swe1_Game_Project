package com.swe1.game.Entity;

import java.util.UUID;

public class GameMaster {
	
	private UUID userId = UUID.randomUUID();
	private String name;
	private String userName;
	private String matrikelNr;
	private String email;
	private String password;
	
	public GameMaster(UUID userId, String name, String userName, String matrikelNr, String email, String password){
		this.userId = userId;
		this.name = name;
		this.userName = userName;
		this.matrikelNr = matrikelNr;
		this.email = email;
		this.password = password;
		
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMatrikelNr() {
		return matrikelNr;
	}

	public void setMatrikelNr(String matrikelNr) {
		this.matrikelNr = matrikelNr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
