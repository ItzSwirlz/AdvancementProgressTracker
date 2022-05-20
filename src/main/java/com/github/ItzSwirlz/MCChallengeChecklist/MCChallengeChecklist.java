package com.github.ItzSwirlz.MCChallengeChecklist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import com.github.ItzSwirlz.MCChallengeChecklist.checklists.ACompleteCatalogue;

@SuppressWarnings("serial")
public class MCChallengeChecklist extends JFrame {

	public MCChallengeChecklist() {
		super();
		setTitle("Minecraft Challenge Checklist");
		setPreferredSize(new Dimension(500, 800));
		getContentPane().setLayout(new BorderLayout());
		setVisible(true);
		setDefaultLookAndFeelDecorated(true);
		
		JPanel headerbar = new JPanel();
		headerbar.setSize(500, 75);
		headerbar.setAlignmentY(TOP_ALIGNMENT);
		headerbar.setBackground(Color.gray);
		headerbar.setVisible(true);
		
		JList<?> checklist = new JList<>();
		checklist.setSize(500, 50);
		checklist.setBackground(Color.darkGray);
		checklist.setVisible(true);
		checklist.add(new ACompleteCatalogue());
		checklist.setAlignmentX(TOP_ALIGNMENT - 75);
		
		this.add(headerbar);
		this.add(new ACompleteCatalogue());
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public static void main(String[] args) {
		new MCChallengeChecklist();
	}

}
