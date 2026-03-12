package game.engine.cells;

import game.engine.monsters.Monster;

import game.engine.interfaces.*;


public class MonsterCell extends Cell implements CanisterModifier{
		
		private final Monster cellMonster; //READ
		
		public MonsterCell(String name, Monster cellMonster) {
			super(name);
			
			this.cellMonster = cellMonster;
				
		}
	
		
		
		//SETTER & GETTERS
		
		public Monster getCellMonster() {
			return cellMonster;
		}
}
