package com.app.main;

import com.app.dao.PlayerDao;
import com.app.dao.impl.PlayerDaoImpl;
import com.app.model.Player;
import java.sql.DriverManager;
import java.util.List;

public class PlayerMain {

	public static void main(String[] args) {


		PlayerDao dao=new PlayerDaoImpl();
//		Player player=new Player(140, "Rudra", 24, "Queens", "male", "St. Louis");
//		int c=dao.createPlayer(player);
//		if(c==1) {
//			System.out.println("Player registered below");
//			System.out.println(player);
//		}else {
//			System.out.println("failed");
//		}
		
		
		List<Player> playersList=dao.getAllPlayers();
		System.out.println("\n\nThere are "+playersList.size()+" no of players registered with us.. Below are the details");
		for(Player p:playersList) {
			System.out.println(p);
			
		dao.updatePlayer(140, "Atlanta");
		

		playersList=dao.getAllPlayers();
		System.out.println("\n\nThere are "+playersList.size()+" no of players registered with us.. Below are the details");
		for(Player x:playersList) {
			System.out.println(x);
		
		dao.deletePlayer(130);
		dao.deletePlayer(120);
		
		playersList=dao.getAllPlayers();
		System.out.println("\n\nThere are "+playersList.size()+" no of players registered with us.. Below are the details");
		for(Player d:playersList) {
			System.out.println(d);

	}

}}}}
