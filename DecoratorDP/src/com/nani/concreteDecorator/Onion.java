package com.nani.concreteDecorator;

import com.nani.component.Dosa;
import com.nani.decorator.DosaDecorator;

public class Onion extends DosaDecorator{

	public Onion(Dosa dosa) {
		super(dosa);
	}
	@Override
	public void prepare() {
		
		super.prepare();
		addOnion();
		
	}
	private void addOnion() {
		
		System.out.println("onions Added");
		
	}

}
