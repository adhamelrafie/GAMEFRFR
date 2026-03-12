package game.engine.cells;

import game.engine.monsters.Monster;

public class Cell {
		private final String name; //READ
		
		private Monster monster; //READ WRITE

		
		public Cell(String name){
			this.name = name;
		}
		
		
	//Setters & Getters
		
		public String getName() {
			return name;
		}
		
		
		
		public Monster getMonster() {
			return monster;
		}
		
		public void setMonster(Monster monster) {
			this.monster = monster;	
		}
		
}
