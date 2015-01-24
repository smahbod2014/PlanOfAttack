package koda.poa;

import java.util.ArrayList;

public class Player {

	public static final int FOOD_GAIN = 3;
	public static final int GOLD_GAIN = 4;
	public static final int IRON_GAIN = 3;
	
	private boolean isEnemy;
	private ArrayList<City> cities;
	private int food;
	private int gold;
	private int iron;
	public int id;
	
	public Player(boolean enemy, int id) {
		isEnemy = enemy;
		cities = new ArrayList<City>();
		this.id = id;
	}
	
	@SuppressWarnings("incomplete-switch")
	public void step() {
		for (City c : cities) {
			switch (c.resource) {
			case FOOD: food += c.getResources(FOOD_GAIN); break;
			case GOLD: gold += c.getResources(GOLD_GAIN); break;
			case IRON: iron += c.getResources(IRON_GAIN); break;
			}
		}
	}
}
