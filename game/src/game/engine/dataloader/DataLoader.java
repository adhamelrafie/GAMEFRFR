package game.engine.dataloader;

import java.io.IOException;

import java.util.ArrayList;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import game.engine.cards.*;

import game.engine.cells.*;

import game.engine.monsters.*;

import game.engine.Role;

public class DataLoader {
	
		private static final String CARDS_FILE_NAME = "cards.csv";
		
		private static final String CEllS_FILE_NAME = "cells.csv";
		
		private static final String MONSTERS_FILE_NAME = "monsters.csv";
		
		
		
		public static ArrayList<Card> readCards() throws IOException{
			ArrayList<Card> cards = new ArrayList<>();
			
			BufferedReader br = new BufferedReader(new FileReader(CARDS_FILE_NAME));
			String line;
			
			while((line = br.readLine()) != null) {
				String[] vals = line.split(",");
				
				String type = (String) vals[0];
				
				Card card = null;
				
				switch(type) {
				case "SWAPPER":
					 	card = 
						new SwapperCard(vals[1], vals[2], Integer.parseInt(vals[3]));		
					 	break;
					 	
				case "SHIELD":
						card =
						new ShieldCard(vals[1], vals[2], Integer.parseInt(vals[3]));
						break;
						
				case "ENERGYSTEAL":
						card = 
						new EnergyStealCard(vals[1], vals[2], 
						Integer.parseInt(vals[3]), Integer.parseInt(vals[4]));		
						break;
				
				
				case "STARTOVER":
						card = 
						new StartOverCard(vals[1],vals[2],
						Integer.parseInt(vals[3]), Boolean.parseBoolean(vals[4].trim()));
						break;
				
				case "CONFUSION":
						card = 
						new ConfusionCard(vals[1],vals[2],
						Integer.parseInt(vals[3]),Integer.parseInt(vals[4]));
						break;
				}
				
				
				cards.add(card);
			
		}
				br.close();
				
				return cards;
				
				
		}
		
		
		
		public static ArrayList<Cell> readCells() throws IOException{
			ArrayList<Cell> cells = new ArrayList<>();
			
			BufferedReader br = new BufferedReader(new FileReader(CEllS_FILE_NAME));
			
			String line;
			
		while((line = br.readLine()) != null) {
				String[] vals = line.split(",");
				
				Cell cell = null;
				
				if(vals.length == 3) {
					cell = new DoorCell(vals[0], 
					Role.fromString(vals[1]), 
					Integer.parseInt(vals[2]));
				}
				
				
				else if( Integer.parseInt(vals[1]) < 0){
					cell = new ContaminationSock(vals[0], 
					Integer.parseInt(vals[1]));
				}
				
				else {
					cell = new ConveyorBelt(vals[0],
					Integer.parseInt(vals[1]));
				}
				
				cells.add(cell);
				
			}
			
				br.close();
				
				return cells;
			
		}
		
		
		public static ArrayList<Monster> readMonsters() throws IOException{
			ArrayList<Monster> monsters = new ArrayList<>();
			
			BufferedReader br = new BufferedReader(new FileReader(MONSTERS_FILE_NAME));
			
			String line;
			
			Monster monster = null;
			while((line = br.readLine()) != null) {
				String[] vals = line.split(",");
				
				String type = vals[0];
				
				switch(type)
				{
					case "DYNAMO":
						monster = new Dynamo(vals[1], vals[2], Role.fromString(vals[3]), Integer.parseInt(vals[4]));
						break;

					case "DASHER":
						monster = new Dasher(vals[1], vals[2], Role.fromString(vals[3]), Integer.parseInt(vals[4]));
						break;

					case "MULTITASKER":
						monster = new MultiTasker(vals[1], vals[2], Role.fromString(vals[3]), Integer.parseInt(vals[4]));
						break;
						
					case "SCHEMER":
						monster = new Schemer(vals[1], vals[2], Role.fromString(vals[3]), Integer.parseInt(vals[4]));
						break;
				}

					monsters.add(monster);
			}
				br.close();
				return monsters;
		}
		
		
		
		
		public static void main(String[] args) {


				try {
            ArrayList<Cell> cells = DataLoader.readCells();
            System.out.println(cells);

           
        } catch (Exception e) {
            e.printStackTrace();
        }
				
	}}
