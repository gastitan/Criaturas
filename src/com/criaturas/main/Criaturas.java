package com.criaturas.main;

import javax.swing.JFrame;

import com.criaturas.vista.PanelCreacion;

public class Criaturas {

	public static void main(String[] args) 
	{
		PanelCreacion pc = new PanelCreacion();
		JFrame frame = pc.crearPantalla();
 
		frame.setVisible(true);
	}

}
