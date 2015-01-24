package koda.poa;

import java.util.ArrayList;

import koda.poa.City.Resource;

public class GameLogic {

	static final int NEUTRAL_PLAYER = 0;
	
	ArrayList<City> cities;
	Player player;
	Player enemy;
	
	public GameLogic() {
		cities = new ArrayList<City>();
		player = new Player(false, 1);
		enemy = new Player(true, 2);
		init();
	}
	
	public void init() {
		City c1 = new City(Resource.NONE, 200, NEUTRAL_PLAYER, 25);
		City c2 = new City(Resource.FOOD, 300, NEUTRAL_PLAYER, 25);
		City c3 = new City(Resource.NONE, 200, enemy.id, 25);
		City c4 = new City(Resource.GOLD, 250, NEUTRAL_PLAYER, 25);
		City c5 = new City(Resource.IRON, 200, player.id, 25);
		
		c1.addLink(c2);
		c1.addLink(c5);
		
		c2.addLink(c3);
		c2.addLink(c5);
		
		c3.addLink(c4);
		
		c4.addLink(c5);
	}
}
