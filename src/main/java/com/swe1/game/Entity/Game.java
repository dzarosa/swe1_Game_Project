package com.swe1.game.Entity;

import java.sql.Timestamp;
import java.util.UUID;

public class Game {

	public enum gamesStatus{
		Beginn, End
	}
	
	public enum spiel{
		move, your_turn
	}
	private spiel spiel;
	private gamesStatus gameStatus;
	private UUID gameId = UUID.randomUUID();
	private UUID gameServiceId;
	private Timestamp begin = new Timestamp(System.currentTimeMillis());
	
	public Game(UUID gameId, Timestamp begin, gamesStatus gameStatus,  UUID gameServiceId){
		this.gameId = gameId;
		this.begin = begin;
		this.gameStatus = gameStatus;
		this.setGameServiceId(new UUID(0, 0));
		
	}

	public UUID getGameId() {
		return gameId;
	}

	public void setGameId(UUID gameId) {
		this.gameId = gameId;
	}

	public Timestamp getBegin() {
		return begin;
	}

	public void setBegin(Timestamp begin) {
		this.begin = begin;
	}

	public gamesStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(gamesStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public UUID getGameServiceId() {
		return gameServiceId;
	}

	public void setGameServiceId(UUID gameServiceId) {
		this.gameServiceId = gameServiceId;
	}

	public spiel getSpiel() {
		return spiel;
	}

	public void setSpiel(spiel spiel) {
		this.spiel = spiel;
	}
}
