package com.nani.customers;

import com.nani.BajajFactory.BajajBikeFactory;
import com.nani.BajajFactory.BajajFactory;
import com.nani.subbranches.ChennaiBranch;
import com.nani.subbranches.NagapurBranch;

public class ChennaiCustomer{

	public static void main(String[] args) {
		
		BajajFactory factory = null;
		BajajBikeFactory bike = null;
		
		
		factory = new NagapurBranch();
		bike = factory.getInstanse("platina");
		bike.run();

	}

}
