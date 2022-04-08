package com.inti;

public class Medicament extends Pharmacie{

	
/// ATTRIBUTS
	
	  private String nom;
	  private double prix;
	  private int stock;
	 

	  
/// constructeur surchargé
	  
public Medicament(String nom, double prix, int stock) 
		{
	    this.nom = nom;
	    this.prix = prix;
	    this.stock = stock;
		}




/// Getter and setter
	  public void augmenterStock(int quantite) 
	  {
	    stock = stock + quantite;
	  }
	 
	  public void diminuerStock(int quantite) 
	  {
	    stock = stock - quantite;
	  }
	 
	  public int getStock() 
	  {
	    return stock;
	  }
	 
	  public double getPrix() 
	  {
	    return prix;
	  }
	 
	  public String getNom() 
	  {
	    return nom;
	  }

}
