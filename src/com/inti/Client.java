package com.inti;

public class Client extends Pharmacie{

/// ATTRIBUTS
	
		protected String nom;
		protected double credit = 0.0; // peut etre negatif
	
/// Defaut
	public Client(String nom, double credit)
	{
		  this.nom = nom;
		  this.credit = credit;
		  }
	

/// Augement/descendre le crédit

		  public void augmenterCredit(double montant) {
		    credit = credit + montant;
		  }

		  public void diminuerCredit(double montant) {
		    credit = credit - montant;
		  }

		  public double getCredit() {
		    return credit;
		  }

		  public String getNom() {
		    return nom;
		  }





}
