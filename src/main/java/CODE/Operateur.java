package CODE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skander
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Operateur extends Personne { //Héritage de la classe Personne
   //attribut
   private int dispo;
   public String compétences;
   //getter et setter
    public int Getdispo(){
        return dispo;
    }
    public void  Setdispo(int d){
        this.dispo=d;
    }
    
    
    //Constructeur Operateur
    public Operateur(String idpersonne, String nom, String prenom,int dispo,String Compétences,String lien) {
        super(idpersonne, nom, prenom); //Hériter nom prenom identité de la classe Personne
        this.dispo=dispo;
        this.compétences=Compétences;
        ecritureFichier(lien+"Operateurs"+idpersonne+".txt",Compétences);
    }
  
    
    
 
   
   public String AfficherOperateurs() { 
      
         String s= super.AfficherPersonne();
              
        if (this.dispo==0) {
                     return s+" ,non disponible]";
        } 
        else if (this.dispo==1) {
                     return s+" ,disponible]a pour compétences :"+this.compétences;
        }
        // LireFichier("C:/projet"+super.Getidpersonne()+".txt"); //nom du fichier=identité de la personne
       return s;
     
   }
   //Méthode Ecriture dans un fichier
    
   public void ecritureFichier (String nomFichier,String ContenuFichier){
       try{
           File f;
           f=new File(nomFichier);
           if (f.exists()){
               System.out.println("Le fichier "+nomFichier+" existe déjà.");
           }
           //Ouverture: Création d'un nouveau fichier:
           System.out.println("Création d'un fichier"+nomFichier);
           BufferedWriter fichier= new BufferedWriter(new FileWriter(nomFichier));
           //Ecriture
           fichier.write("Mes Compétences");
           fichier.newLine();
           String tab[]=ContenuFichier.split(",");
           for (int i=0;i<tab.length;i++){
               fichier.write(tab[i]);
               fichier.newLine();
           }
           //Fermeture
           fichier.close();
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
   }
   //Méthode Lecture d'un fichier
 
   public void LireFichier (String nomFichier){
      try{
          String ligne;
          //Ouverture:Lecture fichier
          BufferedReader fichier=new BufferedReader(new FileReader(nomFichier));
          //Lecture
                  while ((ligne=fichier.readLine())!=null){
                      System.out.println(ligne);
                      
                  }
           //Fermeture
           fichier.close();
      }
      catch(Exception e){
          System.out.println(e.getStackTrace());
      }
   }
          
                 
                  
          
     
   
           
}         
       
   

         
   

   


 





           
         
  
   
         
    
    
  
  
