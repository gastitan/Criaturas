package com.criaturas.personajes;

public class Personaje {
	public Personaje(){}
	
	public double defensa;
	public double daño;
	public double vida;
	public double mana;
	public String arma;

	public Personaje(double defensa,double daño,double vida,double mana){
	      this.defensa= defensa;
	      this.daño= daño;
	      this.vida= vida;
	      this.mana= mana;
	}
	
	
	
	public void atacarA(Personaje atacado){
		//atacado.vida= atacado.vida- this.daño;
		if(atacado.defensa>= this.daño){
			
			atacado.vida=atacado.vida- 0; 
		}
			
			
		else {
			
			atacado.vida=atacado.vida-(daño-atacado.defensa);
			
		}
	
	}
}