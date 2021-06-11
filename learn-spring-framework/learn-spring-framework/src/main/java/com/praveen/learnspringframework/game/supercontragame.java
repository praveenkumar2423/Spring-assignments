package com.praveen.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class supercontragame implements GamingCansole {

	public void up() {
		System.out.println(" supercontragame up");
	}
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}
	
}
