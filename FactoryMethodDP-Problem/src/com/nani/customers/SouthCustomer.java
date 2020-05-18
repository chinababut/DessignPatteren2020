package com.nani.customers;

import com.nani.BajajFactory.BajajBike;

import com.nani.subbranches.ChennaiBranch;
import com.nani.subbranches.NagapurBranch;

public class SouthCustomer{

	public static void main(String[] args) {
		
		BajajBike bike = null;
		
		bike = ChennaiBranch.buildBike("ct100");
		bike.run();

	}

}
