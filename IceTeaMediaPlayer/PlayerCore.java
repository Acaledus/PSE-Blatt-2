package de.unistuttgart.iaas.icetea;

import java.net.URL;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class PlayerCore {

	private BasicPlayer player;
	
	public PlayerCore() {
		this.player = new BasicPlayer();
	}

	public void open(URL url) {
		try {
			//TODO do Task here
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public void play() {
		try {
			//TODO do Task here
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public void pause() {
		try {
			//TODO do Task here
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public void resume() {
		try {
			//TODO do Task here
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public void stop() {
		try {
			//TODO do Task here
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//TODO test here
	}
}
