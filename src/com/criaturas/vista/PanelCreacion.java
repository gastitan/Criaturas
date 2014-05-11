package com.criaturas.vista;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.criaturas.personajes.Elfo;
import com.criaturas.personajes.HadaMariposa;
import com.criaturas.personajes.Humano;
import com.criaturas.personajes.Mago;
import com.criaturas.personajes.Orco;
import com.criaturas.personajes.Personaje;

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
            	Object[] options = {"Humano", "Orco", "Elfo", "Hechicero", "Hada Mariposa"};
            	int seleccion = JOptionPane.showOptionDialog(frame,
            		    "Que personaje quiere crear",
            		    "Crear Personaje",
            		    JOptionPane.YES_NO_CANCEL_OPTION,
            		    JOptionPane.QUESTION_MESSAGE,
            		    null,
            		    options,
            		    options[2]);
            	
            	if (seleccion != -1)
            	{
            		mostrarPersonajeElegido(seleccion);
            	}
            }

        });
		panel.add(botonCrear);
		
		
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		
		
		return frame;
	}
	
	public void mostrarPersonajeElegido(int seleccion) {
		switch(seleccion)
		{
			case 0: crearHumano(); break;
			case 1: crearOrco(); break;
			case 2: crearElfo(); break;
			case 3: crearMago(); break;
			case 4: crearHada(); break;
			default: break;
		}
		
	}

	private void crearHada() {
		HadaMariposa hm = new HadaMariposa();
		imprimirPersonaje(hm);
		
	}

	private void imprimirPersonaje(Personaje p) {
		System.out.println("Vida: "+p.vida);
		System.out.println("Mana: "+p.mana);
		System.out.println("Defensa: "+p.defensa);
		System.out.println("Daño: "+p.daño);
	}

	private void crearMago() {
		Mago m = new Mago();
		imprimirPersonaje(m);
	}

	private void crearElfo() {
		Elfo e = new Elfo();
		imprimirPersonaje(e);
		
	}

	private void crearOrco() {
		Orco o = new Orco();
		imprimirPersonaje(o);
	}

	private void crearHumano() {
		Humano h = new Humano();
		imprimirPersonaje(h);
	}
}
