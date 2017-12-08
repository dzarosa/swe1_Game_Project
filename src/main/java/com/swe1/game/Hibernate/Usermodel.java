package com.swe1.game.Hibernate;

import com.swe1.game.Entity.GameMaster;

public class Usermodel extends AbstractUser<GameMaster> {

	public Usermodel() {
		super(GameMaster.class);
	}

}