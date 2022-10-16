package CODE;


import CODE.Lire;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skander
 */
public class Produit {
    //Déclaration des attributs Produit
   public int codeproduit; //Code produit
   public String dProduit; //Désignation Produit
   //Constructeurs
   
   public Produit(int cp, String dP)
   {
       codeproduit = cp;
       dProduit = dP;
   }
   
   // Méthode to String
   public String toString(){
       return "Produit[Code_produit"+codeproduit+",Désignation_produit"+dProduit+"]";
   }
   
   //Déclaration des getter et setter code produit

   public void setcodeproduit (int c){
       codeproduit = Lire.i();
   }
   //Déclaration des getter et setter désignation produit
 
  public void setdProduit(String d){
      dProduit = Lire.S();   
  }    
   
}
   
    

