package com.accenture;

import java.util.Scanner;

public class Player {
private int pnum;
	
	public int guessNum() {
		System.out.println("Player, provide a number between 0 to 9.");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
	}

	public int getPnum() {
		return pnum;
	}


}
