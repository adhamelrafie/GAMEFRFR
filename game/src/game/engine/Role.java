package game.engine;

public enum Role {

	SCARER, 
	LAUGHER;
	
	
	
	public static Role fromString(String s) {
			return Role.valueOf(s.trim().toUpperCase());
	}
}
