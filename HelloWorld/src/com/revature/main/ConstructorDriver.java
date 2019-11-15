package com.revature.main;

import com.revature.pojos.Quadralateral;

public class ConstructorDriver {

	public static void main(String[] args) {
		// Quadralateral q declares a variable of type Quadralateral
		// = new Quadralateral(); instantiates q and then initializes q (initialization happens with equals sign)
		Quadralateral q = new Quadralateral();
		
		System.out.println(q.getAngles());
		System.out.println(q.getSideLengths());
	}
	
}
