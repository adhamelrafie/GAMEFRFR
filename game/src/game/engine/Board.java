package game.engine;
import java.util.ArrayList;

import game.engine.dataloader.*;
import game.engine.Constants;
import game.engine.cells.Cell;
import game.engine.monsters.Monster;
import game.engine.cards.Card;

public class Board {

        private Cell[][] boardCells;

        private static ArrayList<Monster> stationedMonsters;
        
        private static ArrayList<Card> originalCards;

        public static ArrayList<Card> cards;

        public Board(ArrayList<Card> readCards){
                boardCells = new Cell[Constants.BOARD_ROWS][Constants.BOARD_COLS];

                stationedMonsters = new ArrayList<>();

                cards = new ArrayList<>();

                originalCards = readCards;
        }


        public Cell[][] getBoardCells(){
                return boardCells;
        }

        public static ArrayList<Monster> getStationedMonsters(){
                return stationedMonsters;
        }

        public static void setStationedMonsters(ArrayList<Monster> m){
                stationedMonsters = m;
        }

        public static ArrayList<Card> getOriginalCards(){
                return originalCards;
        }

        public static void setCards(ArrayList<Card> c){
                cards = c;      
        }

        public static ArrayList<Card> getCards(){
                return cards;
        }
}
