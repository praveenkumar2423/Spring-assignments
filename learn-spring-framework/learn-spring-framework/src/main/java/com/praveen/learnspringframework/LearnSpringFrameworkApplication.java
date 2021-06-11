package com.praveen.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.praveen.learnspringframework.game.GameRunner;


@SpringBootApplication
//@ComponentScan("com.praveen.learnspringframework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
	               SpringApplication.run(LearnSpringFrameworkApplication.class, args);
	GameRunner runner = context.getBean(GameRunner.class);
		
		//MarioGame game = new MarioGame();
		//supercontragame game = new supercontragame();
		//GameRunner runner = new GameRunner(game);
	
	runner.rungame();
	
	
	}

}
