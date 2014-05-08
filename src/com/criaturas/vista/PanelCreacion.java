package com.criaturas.vista;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelCreacion
{
	JFrame frame = new JFrame();
	public JFrame crearPantalla()
	{
		frame.setSize(new Dimension(300,300));
		frame.setTitle("Creacion de Criaturas");
		
		JPanel panel = new JPanel();
		panel.setSize(new Dimension(200,200));
		panel.setToolTipText("pantallita");
		
		JButton botonCrear = new JButton("Crear");
		
		botonCrear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
            	Object[] options = {"Humano", "Orco", "Elfo", "Hechicero"};
            	int n = JOptionPane.showOptionDialog(frame,
            		    "Que personaje quiere crear",
            		    "Crear Personaje",
            		    JOptionPane.YES_NO_CANCEL_OPTION,
            		    JOptionPane.QUESTION_MESSAGE,
            		    null,
            		    options,
            		    options[2]);
            	
            }
        });
		panel.add(botonCrear);
		
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		
		
		return frame;
	}
}
