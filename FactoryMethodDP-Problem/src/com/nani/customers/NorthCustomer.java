package com.nani.customers;


import com.nani.BajajFactory.BajajBike;
import com.nani.subbranches.NagapurBranch;

public class NorthCustomer{

	public static void main(String[] args) {
		
		BajajBike bike = null;
		
		bike = NagapurBranch.buildBike("pulsor");
		bike.run();

	}

}
