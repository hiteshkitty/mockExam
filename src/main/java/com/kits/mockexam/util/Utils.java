package com.kits.mockexam.util;

import java.util.Random;

public class Utils {

	static public int getNextRandomNumber() {
		
		Random random = new Random();
		return random.nextInt(5);
	}
}
