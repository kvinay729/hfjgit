package com.hfj;

public class DotComTestDrive {

	public static void main(String args[])
	{
		int numOfGuess=0;
		DotCom d = new DotCom();
		GameHelper g = new GameHelper();
		int rand = (int)(Math.random()*5);
		int comlocs[]= {rand,rand+1,rand+2};
		d.setLocationCells(comlocs);
		boolean isAlive = true;
		while(isAlive == true)
		{
		 String guess = g.getUserInput("ENter the number");
		 String result = d.checkUserInput(guess);
		 numOfGuess++;
		 if(result.equals("kill")) {
			 isAlive=false;
		 }
		}
		System.out.println("you took "+numOfGuess + "guesses");
		
		
	}
	
}
