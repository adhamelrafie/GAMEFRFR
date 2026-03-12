package game.engine;

import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

import game.engine.monsters.Monster;
import game.engine.Role;
import game.engine.dataloader.DataLoader;
import game.engine.cards.Card;

import java.io.IOException;

public class Game {
        private final Board board;
        private final ArrayList<Monster> allMonsters;
        private final Monster player;
        private final Monster opponent;
        private Monster current;

        public Game(Role playerRole) throws IOException{
                ArrayList<Card> loadedCards = DataLoader.readCards();
                this.board = new Board(loadedCards);

                allMonsters = DataLoader.readMonsters();

                this.player = selectRandomMonsterByRole(playerRole);

                Role opponentRole;

                if(playerRole == Role.LAUGHER)
                        opponentRole = Role.SCARER;
                else
                        opponentRole = Role.LAUGHER;

                this.opponent = selectRandomMonsterByRole(opponentRole);
                
                this.current = player;
        }



        private Monster selectRandomMonsterByRole(Role role){
                ArrayList<Monster> monsters = new ArrayList<>();

                for(int i = 0; i < allMonsters.size(); i++){
                        Monster m = allMonsters.get(i);

                        if(m != null && m.getRole() == role){
                                monsters.add(m);
                        }
                }

                Random random = new Random();
                int index = random.nextInt(monsters.size());

                return monsters.get(index);


        }

        public Board getBoard() {
        return board;
         }

    public ArrayList<Monster> getAllMonsters() {
        return allMonsters;
         }

    public Monster getPlayer() {
        return player;
         }

    public Monster getOpponent() {
        return opponent;
        }

    public Monster getCurrent() {
        return current;
        }

    public void setCurrent(Monster current) {
        this.current = current;
         }
    
    
    public static void main(String[] args) {
		System.out.println("hi");
	}
}       
