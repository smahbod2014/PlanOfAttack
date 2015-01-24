package koda.poa;

import java.util.ArrayList;

public class City {

	public enum Resource {NONE, GOLD, FOOD, IRON};
	
	public Resource resource;
	public int resAmount;
	public int population;
	public int owner;
	public int numTroops;
	public ArrayList<City> neighbors;
	
	public City(Resource res, int pop, int own, int nt) {
		resource = res;
		population = pop;
		owner = own;
		numTroops = nt;
		neighbors = new ArrayList<City>();
		if (res != Resource.NONE)
			resAmount = 100;
	}
	
	public boolean isDepleted() {
		return resAmount == 0;
	}
	
	public int getResources(int amount) {
		int amt = Math.min(resAmount - amount, resAmount);
		resAmount -= amt;
		return amt;
	}
	
	public void addLink(City c) {
		neighbors.add(c);
		if (!c.isLinkedTo(this))
			c.addLink(this);
	}

	public boolean isLinkedTo(City c) {
		return neighbors.contains(c);
	}
}
