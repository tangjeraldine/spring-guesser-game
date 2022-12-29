package com.accenture;

import java.util.Random;

public class Guesser {
	private int gnum;

	public int guessNum() {
		Random rand = new Random();
		int upperbound = 10; //generate random values from 0 to 9
		gnum = rand.nextInt(upperbound);
		return gnum;
	}

	public int getGnum() {
		return gnum;
	}

}
