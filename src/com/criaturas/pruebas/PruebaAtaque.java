package com.criaturas.pruebas;

import com.criaturas.personajes.Elfo;
import com.criaturas.personajes.HadaMariposa;
import com.criaturas.personajes.Humano;
import com.criaturas.personajes.Mago;
import com.criaturas.personajes.Personaje;

public class PruebaAtaque {

	public static void main(String[] args) {
		Mago m = new Mago();
		//imprimirPersonaje(m);
		//System.out.println("-------------------------------------");
		Elfo e=new Elfo();
	    imprimirPersonaje(e);
		System.out.println("-------------------------------------");

		HadaMariposa h=new HadaMariposa();
		imprimirPersonaje(h);
		System.out.println("--------------------------------------");
	    
	    h.atacarA (e);
	    
	    imprimirPersonaje(e);
	    }
	private static void imprimirPersonaje(Personaje p) {
		System.out.println("Vida: "+p.vida);
		System.out.println("Mana: "+p.mana);
		System.out.println("Defensa: "+p.defensa);
		System.out.println("Daño: "+p.daño);
	}
}
