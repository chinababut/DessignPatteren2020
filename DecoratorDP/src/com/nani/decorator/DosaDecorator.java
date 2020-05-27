package com.nani.decorator;

import com.nani.component.Dosa;

public abstract class DosaDecorator implements Dosa{
	
	Dosa dosa;

	public DosaDecorator(Dosa dosa) {
		
		this.dosa = dosa;
	}
	
	@Override
	public void prepare() {
		
		dosa.prepare();
		
	}
	

}
