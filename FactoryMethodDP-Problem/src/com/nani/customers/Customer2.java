package com.nani.customers;

import com.nani.BajajFactory.BajajFactory;
import com.nani.subbranches.ChennaiBranch;
import com.nani.subbranches.NagapurBranch;

public class Customer2{

	public static void main(String[] args) {
		
		BajajFactory bike = null;
		
		bike = ChennaiBranch.buildBike("ct100");
		bike.run();

	}

}
