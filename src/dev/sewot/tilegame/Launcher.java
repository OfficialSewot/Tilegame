package dev.sewot.tilegame;

import dev.sewot.tilegame.display.Display;

public class Launcher {
	public static void main(String[] args){
		Game game = new Game("Tilegame", 640, 360);
		game.start();
	}

}
