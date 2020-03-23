package com.xebia.MelonBlaster;

import com.xebia.MelonBlaster.service.MelonBlasterFacade;

public class XebiaTest {

	public static void main(String[] args) {
		
		MelonBlasterFacade blasterFacade = new MelonBlasterFacade();
		int score = blasterFacade.getArcherScore(args[0]);
		System.out.println("Score:"+ score);
		
		}
		
}
