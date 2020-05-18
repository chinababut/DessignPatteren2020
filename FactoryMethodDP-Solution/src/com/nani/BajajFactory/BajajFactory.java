package com.nani.BajajFactory;

public abstract class BajajFactory {
	
	public abstract void paint();
	public abstract void assemble();
	public abstract void test();
	public abstract void oiling();
	public abstract BajajBikeFactory buildBike(String bikeModel); 

	public BajajBikeFactory getInstanse(String bikeModel){
		BajajBikeFactory bike = null;
		bike = buildBike(bikeModel);
		paint();
		assemble();
		test();
		oiling();
		return bike;
		
		
	}

}
