package com.github.ItzSwirlz.MCChallengeChecklist.checklists;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JList;

@SuppressWarnings("serial")
public class ACompleteCatalogue extends JList<Object> {
	public ACompleteCatalogue() {
		Checkbox black = new Checkbox("Black");
		black.setLabel("Black");
		
		Checkbox british_shorthair = new Checkbox("British Shorthair");
		british_shorthair.setLabel("British Shorthair");
		
		ArrayList<Checkbox> tasks = new ArrayList<Checkbox>();
		tasks.add(black);
		tasks.add(british_shorthair);
		
		Iterator<Checkbox> i = tasks.iterator();
		while(i.hasNext()) {
			this.add((Component) i);
		}
		this.setVisible(true);
	}
}
	