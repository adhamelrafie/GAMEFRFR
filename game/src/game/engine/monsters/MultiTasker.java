package game.engine.monsters;

import game.engine.Role;

public class MultiTasker extends Monster{
	
		private  int normalSpeedTurns; //READ WRITE
	
		public MultiTasker(String name, String description, Role role, int energy) {
			
			super(name,description, role, energy);
			
			normalSpeedTurns = 0;
			
		}
		
		
	//Setters & Getters
		public int getNormalSpeedTurns() {
			return normalSpeedTurns;
		}
		
		public void setNormalSpeedTurns(int s){
			if(s > 0)
				normalSpeedTurns = s;
			else
				normalSpeedTurns = 0;
		}
		
}
