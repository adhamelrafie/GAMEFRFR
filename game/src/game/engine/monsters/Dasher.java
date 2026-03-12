package game.engine.monsters;

import game.engine.Role;

public class Dasher extends Monster{
	
	private int momentumTurns; //READ WRITE
	
	public Dasher(String name, String description, Role role, int energy) {
		super(name, description, role, energy);
		
		momentumTurns = 0;
	}
	
	//Setters & Getters
	public int getMomentumTurns(){
			return momentumTurns;
	}

	public void setMomentumTurns(int m){
		if(m >= 0)
		momentumTurns = m;
		else
			momentumTurns = 0;
	}
	
	
}
