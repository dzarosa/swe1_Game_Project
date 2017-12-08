package com.swe1.game.Entity;

import java.sql.Timestamp;
import java.util.UUID;


public class Login {
	private UUID loginId = UUID.randomUUID();
	private GameMaster userId;
	private Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
	
	public Login (UUID loginId, Timestamp timeStamp){
		this.loginId = loginId;
		this.timeStamp = timeStamp;
	}
	
	
	
	public UUID getLoginId() {
		return loginId;
	}
	public void setLoginId(UUID loginId) {
		this.loginId = loginId;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	
}
