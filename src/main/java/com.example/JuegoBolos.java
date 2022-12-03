package com.example;

import com.example.BowlingGame.BowlingGame;
public class JuegoBolos {
	public static void main(String[] args) {
		BowlingGame juegobolos = new BowlingGame();
		juegobolos.roll(1);
		System.out.println("El Score es de: " +juegobolos.score());
	}
}
