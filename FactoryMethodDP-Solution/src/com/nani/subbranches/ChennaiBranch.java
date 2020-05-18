package com.nani.subbranches;

import com.nani.BajajFactory.BajajBikeFactory;
import com.nani.BajajFactory.BajajFactory;
import com.nani.BajajFactory.CT100Bike;
import com.nani.BajajFactory.PlatinaBike;
import com.nani.BajajFactory.PulsorBike;

public class ChennaiBranch extends BajajFactory {
	static BajajBikeFactory model;
	
	public  void paint() {
		System.out.println("Paint COmpleted");
	}
	public void assemble() {
		System.out.println("assemble COmpleted");
	}
	public void test() {
		System.out.println("test COmpleted");
	}
	
	public void oiling() {
		System.out.println("oiling COmpleted");
	}
	public BajajBikeFactory buildBike(String bikeModel) {
		model = null;
		if(bikeModel.equalsIgnoreCase("pulsor")) {
			model = new PulsorBike();
			System.out.println("pulsor bike creting");
		}
		else if(bikeModel.equalsIgnoreCase("platina")) {
			model = new PlatinaBike();
			System.out.println("platina bike creteing");
		}
		else if(bikeModel.equalsIgnoreCase("CT100")) {
			model = new CT100Bike();
			System.out.println("platina bike creteing");
		}
		else
			throw new IllegalArgumentException("required bike is not avalable");
		return model;
		
	}
	
	

}
