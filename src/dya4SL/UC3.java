package dya4SL;

import java.util.Scanner;

public class UC3 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        int playerPosition=0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter Player Name: ");
	        String playerName = s.next();
	        int diceRoll = (int) Math.floor(Math.random() * 10) %6 +1 ;
	        System.out.println("The Number of dice is:"+ diceRoll);

	        int option =(int) Math.floor(Math.random()*10) %3;

	        if(option == 0) {
	            System.out.println("No Play");
	            playerPosition += 0;
	        }
	        else if(option == 1) {
	            System.out.println("Ladder");
	            playerPosition += diceRoll;
	        }
	        else{
	            System.out.println("Snake");
	            playerPosition -= diceRoll;

	            if(playerPosition < 0) {
	                playerPosition =0;
	            }

	        }
	        System.out.println("Player Position is:" + playerPosition);


	    }
	

	}


