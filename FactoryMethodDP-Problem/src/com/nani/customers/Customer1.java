package com.nani.customers;

import com.nani.BajajFactory.BajajFactory;
import com.nani.subbranches.NagapurBranch;

public class Customer1 {

	public static void main(String[] args) {
		
		BajajFactory bike = null;
		
		bike = NagapurBranch.buildBike("pulsor");
		bike.run();

	}

}
