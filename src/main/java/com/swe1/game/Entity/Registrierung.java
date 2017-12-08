package com.swe1.game.Entity;

import java.util.UUID;

public class Registrierung {
	
	private UUID registrierungId = UUID.randomUUID();
	private GameMaster userId;
	private boolean status;
	
	public Registrierung(UUID registrierungId, boolean status){
		this.setRegistrierungId(registrierungId);
		this.setStatus(status);
	}

	public UUID getRegistrierungId() {
		return registrierungId;
	}

	public void setRegistrierungId(UUID registrierungId) {
		this.registrierungId = registrierungId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
