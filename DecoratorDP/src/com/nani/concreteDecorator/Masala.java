package com.nani.concreteDecorator;

import com.nani.component.Dosa;
import com.nani.decorator.DosaDecorator;

public class Masala extends DosaDecorator{

	public Masala(Dosa dosa) {
		super(dosa);
	}
	@Override
	public void prepare() {
		
		super.prepare();
		addOnion();
		
	}
	private void addOnion() {
		
		System.out.println("Masala Added");
		
	}

}
