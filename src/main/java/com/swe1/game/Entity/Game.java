package com.swe1.game.Entity;

import java.sql.Timestamp;
import java.util.UUID;

public class Game {

	public enum gamesStatus{
		Beginn, End
	}
	private gamesStatus gameStatus;
	private UUID gameId = UUID.randomUUID();
	private GameService gameServiceId;
	private Timestamp begin = new Timestamp(System.currentTimeMillis());
	
	public Game(UUID gameId, Timestamp begin, gamesStatus gameStatus){
		this.gameId = gameId;
		this.begin = begin;
		this.gameStatus = gameStatus;
		
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
		begin = begin;
	}

	public gamesStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(gamesStatus gameStatus) {
		this.gameStatus = gameStatus;
	}
}
