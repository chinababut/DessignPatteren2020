package com.nani.customers;

import com.nani.BajajFactory.BajajBikeFactory;
import com.nani.BajajFactory.BajajFactory;
import com.nani.subbranches.NagapurBranch;

public class NorthCustomer {

	public static void main(String[] args) {
		
		BajajFactory factory = null;
		BajajBikeFactory bike = null;
		
		
		factory = new NagapurBranch();
		bike = factory.getInstanse("ct100");
		bike.run();

	}

}
 