package com.praveen.learnspringframework.game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	private GamingCansole game;

	 public GameRunner(GamingCansole game) {
		System.out.println("using constructor");
		this.game = game;
	 }
	
	public void  rungame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
//@Autowired
	//public void setGame(GamingCansole game) {
		//this.game = game;
	//}
}
