package game.engine.cells;

import game.engine.interfaces.*;

public abstract class TransportCell extends Cell implements CanisterModifier{

		private final int effect;  //READ
		
		public TransportCell(String name, int effect) {
			super(name);
			
			this.effect = effect;
		}
		
		
		public int getEffect() {
			return effect;
		}
		
		
		
	
}
