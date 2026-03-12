package game.engine.cells;

public class ConveyorBelt extends TransportCell{
		
		public ConveyorBelt(String name, int effect) {
			super(name, checkPositiveEffect(effect));
		}
		
		private static int checkPositiveEffect(int effect) {
			if(effect <= 0) {
				return 0;
						}
			
			else return effect;
		}
}
