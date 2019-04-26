package com.controllers;

import java.util.ArrayList;
import java.util.HashMap;

public class Colecciones {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Edwin Parrales");
		a.add("Pablo Gomez");
		
		
		// HashMap con claves enteras y valores de vectores
		HashMap<Integer, ArrayList> hm = new HashMap<Integer, ArrayList>();
		hm.put(1, a);
		ArrayList a2 = hm.get(1);
		

	}

}
