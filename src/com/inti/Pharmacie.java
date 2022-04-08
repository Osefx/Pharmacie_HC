package com.inti;
import com.inti.exception.NomException;

import java.util.Scanner;

public class Pharmacie {


	private static Scanner sca = new Scanner(System.in);
	 
	  public static void main(String args[]) {
	    Client[] clients = new Client[2];
	    Medicament[] medicaments = new Medicament[2];
	 
	    clients[0] = new Client("Hasan", 0.0);
	    clients[1] = new Client("Isabel", 0.0);
	 
	    medicaments[0] = new Medicament("Dafalgan", 2.50, 10);
	    medicaments[1] = new Medicament("Advil", 5.80, 10);
	    
	    int choix;
	 
	    
//////////// CHOIX	    
	    do {
	      choix = menu();
	 
	      switch (choix) {
	      case 1:
	    achat(clients, medicaments);
	    break;
	      case 2:
	    approvisionnement(medicaments);
	    break;
	      case 3:
	    affichage(clients, medicaments);
	    break;
	      case 4:
	    quitter();
	      }
	    } while (choix < 4);
	  }
	  
	  
/////////// LES FONCTIONS
	  
	  
/////////// LE MENU
	 
	  static int menu() {
	    int choix = 0;
	    System.out.println("");
	    System.out.println("*********** MENU ***********");
	    System.out.println("");
	    System.out.println("1 : Achat de médicament");
	    System.out.println("2 : Approvisionnement en  médicaments");
	    System.out.println("3 : Affichage Stocks et Crédits");
	    System.out.println("");
	    System.out.println("4 : Quitter");
	    while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
	      choix = sca.nextInt();
	    }
	    sca.nextLine();
	    return choix;
	  }
	 
	  
/////////// ACHAT MEDICAMENTS
	  	static void achat(Client[] clients, Medicament[] medicaments) {
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
	 

	  
/////////// APPRO MEDIC	  
	  static void approvisionnement(Medicament[] medicaments) {
		  
	    Medicament medicament = lireMedicament(medicaments);
	    
	    System.out.println("Quelle Quantité : ");
	    
	    int quantite = sca.nextInt();
	    
	    sca.nextLine();
	    medicament.augmenterStock(quantite);
	  }
	 
/////////// AFFICHER les données stockées dans les tableaux clients et medicaments
	  
	  static void affichage(Client[] clients, Medicament[] medicaments) {
	 
	    System.out.println("Affichage des stocks");
	    for (int i = 0; i < medicaments.length; i++) {
	    	System.out.println("");
	    	System.out.println("Stock du médicament " + medicaments[i].getNom() + " :" + medicaments[i].getStock());
	    }
	    System.out.println("");
	    System.out.println("Affichage du crédit");
	    for (int i = 0; i < clients.length; i++) {
	    	System.out.println("");
	    	System.out.println("Crédit du client " + clients[i].getNom() + " :" + clients[i].getCredit());
	    }
	  }
	 
/////////// LECTURE CLIENT DANS TABLEAU
	  
	  static Client lireClient(Client[] clients) {
	    String nom;
	    boolean client_existant = false;
	    Client c = null;
	    System.out.println("Nom du client? : ");
	 
	    do {
	      nom = sca.nextLine();
	      for (int i = 0; (!client_existant && i < clients.length); i++) {
	    if ((clients[i].getNom()).equals(nom)) {
	    	client_existant = true;
	      c = clients[i];
	    }
	      }
	      if (!client_existant) {
	    System.out.println("Client inconnu. Veuilliez recommencer");
	      }
	    } while (!client_existant);
	    return c;
	  }
	 
/////////// LECTURE MEDIC DANS TABLEAU
	  static Medicament lireMedicament(Medicament[] medicaments) {
	    String nom;
	    boolean medic_existant = false;
	    Medicament medic = null;
	    System.out.println("Nom du medicament? : ");
	    do {
	      nom = sca.nextLine();
	      for (int i = 0; (!medic_existant && i < medicaments.length); i++) {
	    if ((medicaments[i].getNom()).equals(nom)) {
	    	medic_existant = true;
	      medic = medicaments[i];
	    }
	      }
	      if (!medic_existant) {
	    System.out.println("Medicament non existant, réessayer");
	      }
	    } while (!medic_existant);
	    return medic;
	  }

	  
/////////// LECTURE Paiement
	  
	  static double lirePaiement() {
	      double paiement;
	      System.out.println("Montant du paiement?");
	      paiement = sca.nextDouble();
	      sca.nextLine();
	      return paiement;
	  }
	  
/////////// LECTURE quantité
	  
	  static int lireQuantite() {
	      int quantite;
	      System.out.println("quelle est la quantité achetée?");
	      quantite = sca.nextInt();
	      sca.nextLine();
	      return quantite;
	 
	  }
	  
/////////// QUITTER	 
	  static void quitter() {
	    System.out.println("Fin de l'application!");
	  }
}

	  

	 

