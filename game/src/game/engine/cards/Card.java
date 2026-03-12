package game.engine.cards;
//hhhhhhhh
public abstract class Card {
		
		//READ ONLY
		private final String name;
		
		private final String description;
		
		private final int rarity;
		
		private final boolean lucky;
		
		
		public Card(String name, String description, int rarity, boolean lucky) {
			this.name = name;
			this.description = description;
			this.rarity = rarity;
			this.lucky = lucky;
		}
		
		
		//SETTER AND GETTERS
		private String getName() {
			return name;
		}
		
		private String getDescription() {
			return description;
		}
		
		private int getRarity() {
			return rarity;
		}
		
		private boolean isLucky() {
			return lucky;
		}
		
}
		
