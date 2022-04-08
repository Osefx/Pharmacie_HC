package com.inti;

import com.inti.exception.NomException;

public class Medicament extends Pharmacie{

	
/// ATTRIBUTS
	
	  private String nom;
	  private double prix;
	  public int stock;
	 

	  
/// constructeur surchargé
	  
public Medicament(String nom, double prix, int stock) 
		{
	    this.nom = nom;
	    this.prix = prix;
	    this.stock = stock;
		}



/// fonctions
public static void achat(Client[] clients, Medicament[] medicaments) 
	{
			Client client = lireClient(clients);
			Medicament medicament = lireMedicament(medicaments);
			
			double paiement = lirePaiement();
			int quantite = lireQuantite();
			
			if (quantite <= medicament.getStock()) 
			{
			  medicament.diminuerStock(quantite);
			  client.augmenterCredit((medicament.getPrix() * quantite) - paiement);
			} 
			else
			{
				System.out.println("Quantité insuffisante, stock restant" + lireQuantite());
			}

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
