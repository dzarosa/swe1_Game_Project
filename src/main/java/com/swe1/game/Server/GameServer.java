package com.swe1.game.Server;

import java.util.HashMap;

import java.util.Map;

import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/treasure")
public class GameServer {

	private static final Map<Long, GameService>game = new HashMap<>();
	
	private static long gameId = 1;

    // This method returns a unique Game Number for a game to be created. 
    public static synchronized long getNextGameNumber() {
        long uniqNumber = gameId ++;
        return uniqNumber;
    }

}
