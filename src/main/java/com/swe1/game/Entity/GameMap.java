package com.swe1.game.Entity;

import java.util.UUID;

public class GameMap {
	private UUID gameMapId = UUID.randomUUID();
	private int burgXKoordinate;
	private int burgYKooridnate;
	private Object watter;
	private Object mountain;
	private Object meadow;
	private Game gameId;
	
	public GameMap(UUID gameMapId, int burgXKoordinate, int burgYKooridnate, Object watter, Object mountain, Object meadow){
	
		this.setGameMapId(gameMapId);
		this.setBurgXKoordinate(burgXKoordinate);
		this.setBurgYKooridnate(burgYKooridnate);
		this.setWatter(watter);
		this.setMountain(mountain);
		this.setMeadow(meadow);
	}

	public UUID getGameMapId() {
		return gameMapId;
	}

	public void setGameMapId(UUID gameMapId) {
		this.gameMapId = gameMapId;
	}

	public int getBurgYKooridnate() {
		return burgYKooridnate;
	}

	public void setBurgYKooridnate(int burgYKooridnate) {
		this.burgYKooridnate = burgYKooridnate;
	}

	public int getBurgXKoordinate() {
		return burgXKoordinate;
	}

	public void setBurgXKoordinate(int burgXKoordinate) {
		this.burgXKoordinate = burgXKoordinate;
	}

	public Object getWatter() {
		return watter;
	}

	public void setWatter(Object watter) {
		this.watter = watter;
	}

	public Object getMountain() {
		return mountain;
	}

	public void setMountain(Object mountain) {
		this.mountain = mountain;
	}

	public Object getMeadow() {
		return meadow;
	}

	public void setMeadow(Object meadow) {
		this.meadow = meadow;
	}
	

}
