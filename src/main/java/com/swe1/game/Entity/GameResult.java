package com.swe1.game.Entity;

public class GameResult {
	
	public enum Result{
		You_are_Winner, You_Lose
	}
	private final String endmsg ="Treasuer found  Game Over";
	private Result gameresult;
	
	public GameResult(Result res){
		gameresult= res;
	}
	public String getEndmsg(){
		return endmsg;
		
	}
	public Result getGameResult(){
		return gameresult;
	}
	
}
