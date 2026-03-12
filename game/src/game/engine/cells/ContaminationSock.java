package game.engine.cells;

public class ContaminationSock extends TransportCell{

		public ContaminationSock(String name, int effect) {
			super(name,checkNegativeEffect(effect));
		}
		
		
		private static int checkNegativeEffect(int effect) {
			if(effect >= 0)
				return 0;
			else return effect;
		}
}
