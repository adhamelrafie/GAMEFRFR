package game.engine.monsters;

import game.engine.Role;

public abstract class Monster implements Comparable<Monster>{
		
	private final String name; //READ Only	
	
	private final String description; //READ only
	
	private Role role; //READ And WRITE
	
	private final Role originalRole; //READ Only
	
	private int energy;	//READ And WRItE
	
	private int position; //READ And WRITE
	
	private boolean frozen; //READ And Write
	
	private boolean shielded; //READ And Write
	
	private int confusionTurns; //READ And Write
	
	
	//Setters & Getters
	public String getName(){
		return name;
	}
	
	
	
	public String getDescription() {
		return description;
	}
	
	
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	public Role getOriginalRole() {
		return originalRole;
	}
	
	
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		if(energy > 0)
			this.energy = energy;
		this.energy = 0;
	}
	
	
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int pos) {
		pos = pos % 100;

		if(pos < 0)
			pos += 100;

		this.position = pos;	}
	
	
	
	public boolean isFrozen() {
		return frozen;
	}
	
	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}
	
	
	
	
	public boolean isShielded() {
		return shielded;
	}
	
	public void setShielded(boolean shielded) {
		this.shielded = shielded;
	}
	
	
	
	
	public int getConfusionTurns() {
		return confusionTurns;
	}
	
	public void setConfusionTurns(int confusionTurns) {
		if(confusionTurns > 0)
			this.confusionTurns = confusionTurns;
		else
			this.confusionTurns = 0;	}
	
	
	
	
	//Constructor
	public Monster(String name, String description, Role originalRole, int energy) {
		this.name = name;
		this.description = description;
		this.originalRole = originalRole;
		this.energy = energy;
		
		this.role = originalRole;

		position = 0;
		confusionTurns = 0;
		
		frozen = false;
		shielded = false;
		
	}
	
	
	
	//Methods
	
	
	
	//Override
	public int compareTo(Monster other) {
		return Integer.compare(this.position, other.position);
	}
	
	
	
	
	
		
}
