package com.accenture;

public class Umpire {

	private int numFromGuesser, numFromP1, numFromP2, numFromP3;

	public void collectFromGuesser(Guesser guesser) {
		guesser.guessNum();
		numFromGuesser = guesser.getGnum();
	}

	public void collectFromPlayers(Player p1, Player p2, Player p3) {
		p1.guessNum();
		p2.guessNum();
		p3.guessNum();
		numFromP1 = p1.getPnum();
		numFromP2 = p2.getPnum();
		numFromP3 = p3.getPnum();
	}

	public void compareNums() {
		System.out.println("Guesser has guessed " + numFromGuesser + "!");
		System.out.println("...Player 1 has guessed " + numFromP1 + "\n...Player 2 has guessed " + numFromP2
				+ "\n...Player 3 has guessed " + numFromP3 + ".");
		if (numFromGuesser == numFromP1 && numFromGuesser == numFromP2) {
			System.out.println("Player1 and Player2 have won the game!");
		} else if (numFromGuesser == numFromP1 && numFromGuesser == numFromP3) {
			System.out.println("Player1 and Player3 have won the game!");
		} else if (numFromGuesser == numFromP2 && numFromGuesser == numFromP3) {
			System.out.println("Player2 and Player3 have won the game!");
		} else if (numFromGuesser == numFromP1 && numFromGuesser == numFromP2 && numFromGuesser == numFromP3) {
			System.out.println("ALL players win the game!");
		} else if (numFromGuesser == numFromP1) {
			System.out.println("Player1 has won the game!");
		} else if (numFromGuesser == numFromP2) {
			System.out.println("Player2 has won the game!");
		} else if (numFromGuesser == numFromP3) {
			System.out.println("Player3 has won the game!");
		} else {
			System.out.println("Nobody won...");
		}
	}

}
