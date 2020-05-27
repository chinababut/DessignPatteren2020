package com.nani.customer;

import com.nani.component.Dosa;
import com.nani.concreteDecorator.Gee;
import com.nani.concreteDecorator.Masala;
import com.nani.concreteDecorator.Onion;
import com.nani.concreteDecorator.Upma;
import com.nani.concretecomponent.MinapaDosa;
import com.nani.concretecomponent.SetDosa;

public class Custemer1 {

	public static void main(String[] args) {
		
		Dosa dosa = null;
		dosa = new Masala(new Onion(new Gee(new Upma(new MinapaDosa()))));
		dosa.prepare();
	}

}
