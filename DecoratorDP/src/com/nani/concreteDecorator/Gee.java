package com.nani.concreteDecorator;

import com.nani.component.Dosa;
import com.nani.decorator.DosaDecorator;

public class Gee extends DosaDecorator{

	public Gee(Dosa dosa) {
		super(dosa);
	}
	@Override
	public void prepare() {
		
		super.prepare();
		addOnion();
		
	}
	private void addOnion() {
		
		System.out.println("Gee Added");
		
	}

}
