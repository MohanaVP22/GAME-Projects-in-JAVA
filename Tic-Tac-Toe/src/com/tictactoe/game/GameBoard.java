package com.tictactoe.game;

import java.util.Scanner;

public class GameBoard {
	
	static String x[]= {"0","1","2","3","4","5","6","7","8"},stop="";
	
	static int gameBoard() {
		System.out.println("|"+x[0]+"|"+x[1]+"|"+x[2]+"|");
		System.out.println("|"+x[3]+"|"+x[4]+"|"+x[5]+"|");
		System.out.println("|"+x[6]+"|"+x[7]+"|"+x[8]+"|");
		checkWinner();
		return 0;
	}
	
	public static Object player1() {
		if(stop!="STOP") {
			System.out.println("Player1's turn ");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Any key in 0-8 Range,to place X :");
			int keypress=sc.nextInt();
			String s="X";
			return gameBegin(keypress,s);
		}
		return null;
	}
	public static Object player2() {
		if(stop!="STOP") {
			System.out.println("Player2's turn ");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Any key in 0-8 Range,to place O:");
			int keypress=sc.nextInt();
			String o="O";
			return gameBegin(keypress,o);
		}
		return null;
	}
	
	public static int gameBegin(int key,String print) {
		
		x[key]=print;
		
		return gameBoard();		 
			
	}
	static String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
  
            switch (a) {
            case 0:
                line = x[0] + x[1] + x[2];
                break;
            case 1:
                line = x[3] + x[4] + x[5];
                break;
            case 2:
                line = x[6] + x[7] + x[8];
                break;
            case 3:
                line = x[0] + x[3] + x[6];
                break;
            case 4:
                line = x[1] + x[4] + x[7];
                break;
            case 5:
                line = x[2] + x[5] + x[8];
                break;
            case 6:
                line = x[0] + x[4] + x[8];
                break;
            case 7:
                line = x[2] + x[4] + x[6];
                break;
            }
            //For X winner
            if (line.equals("XXX")) {
            	System.out.println("Congratulations!!");
            	System.out.println("X is Winner");
        		System.out.println("GAME END");
        		stop="STOP";
        		return stop;
            }
              
            // For O winner
            else if (line.equals("OOO")) {
            	System.out.println("Congratulations!!");
            	System.out.println("O is Winner");
        		System.out.println("GAME END");
        		stop="STOP";
                return stop;
            }
        }
		return null;
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * To make turn for two players
		 * -use for loop
		 * 
		 */
		System.out.println("WELCOME To TIC-TAC-TOE GameBoard");
		System.out.println("Player1 - X");
		System.out.println("Player2 - O");
		for(int i=1;i<=9;i++) {
			//turn for players
			
				if(i==1) {
					player1();
				}
				else if(i%2==0) {
					player2();
				}
				else {
					player1();
				}
			}				
		
	}	
}
