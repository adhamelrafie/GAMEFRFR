package game.engine.cards;

import game.engine.interfaces.*;

public class EnergyStealCard extends Card implements CanisterModifier{
		private final int energy; //READ
		
		public EnergyStealCard(String name, String description, int rarity, int energy) {
			super(name,description,rarity,true);
			this.energy = energy;
		}
		
		
		private int getEnergy() {
			return energy;
		}
		
		
}
