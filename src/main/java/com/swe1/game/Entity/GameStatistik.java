package com.swe1.game.Entity;

import java.util.UUID;

public class GameStatistik {
	private UUID statistikId = UUID.randomUUID();
	private GameService gameId;
	private int score;
	
	public GameStatistik(UUID statistikId, int score){
		this.setStatistikId(statistikId);
		this.setScore(score); 
	}

	public UUID getStatistikId() {
		return statistikId;
	}

	public void setStatistikId(UUID statistikId) {
		this.statistikId = statistikId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
