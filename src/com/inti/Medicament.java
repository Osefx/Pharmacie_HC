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
	  
	  /**
	   * • Créer une Exception : nbMedicamentNegException(), qui permet au programme de 
	   * continuer même si l'utilisateur approvisionne un médicament avec un nombre négatif. 
	   * 
	   * 
	   * • Créer une Exception : notEnoughStockException() , qui permet au programme de 
	   * continuer même si un client souhaite acheter plus de boîtes de médicament qu'il y en a 
	   * en stock. Le programme doit afficher combien il reste de boîtes du médicament 
	   * demandé, puis demander à l'utilisateur s'il veut les boîtes en stock
	   */

}
