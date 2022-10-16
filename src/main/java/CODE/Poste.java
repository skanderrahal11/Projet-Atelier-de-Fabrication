package CODE;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skander
 */



public class Poste {
  //Déclaration attributs Poste  
 public static String refposte; //reférence du poste
 public static String dposte; //Désignation du poste

 
 //Constructeurs
 
 public Poste(String rp, String dp)
 {
     refposte = rp;
     dposte = dp;
     //int nbrmachine =0;
 }
 
 
 //Méthode to string
 public String toString(){
     return"Poste[refernce"+refposte+",designation"+dposte+"]";
     
 }
 
    
    //Création poste
   
    // cette méthode permet de créer un nouveau poste (elle est similaire à toutes les autres méthodes de la forme set ... ). 
    public static void setPoste(String d, String r) throws IOException, ClassNotFoundException{
        
    
    // création du fichier dans le répertoire ci dessous, dans le fichier Postes. Ce fichier porte comme nom la designation et la référence du poste
    File fichier = new File(Atelier.lien()+"Equipement/Postes/"+d+"("+r+").txt");
    PrintWriter out = new PrintWriter(new FileWriter(fichier)) ;     
    }
    
    //Fonction ajouter machine.
    //cette fonction permet d'ajouter une machine dans le fichier texte d'un poste. Dans le fichier texte d'un poste, les machines sont séparées par des "=".
    public static void addMachine(String d, String r, String machine ) throws FileNotFoundException, IOException{
        
        File fichier = new File(Atelier.lien()+"Equipement/Postes/"+d+"("+r+").txt");
        
           
        BufferedReader br = new BufferedReader(new FileReader(Atelier.lien()+"Equipement/Machines/"+machine)); 
  
         String st; 
         while ((st = br.readLine()) != null){
         FileWriter writer = new FileWriter(fichier, true);
         String contenu = st;
         writer.write(contenu+"="); 
         writer.flush();
         writer.close();}

        
        }
    
    //Fonction supprimer poste
       public static void supPoste(String r, String d){
        
        File fichier = new File(Atelier.lien()+"Equipement/Postes/"+d+"("+r+").txt");
        fichier.delete();
        System.out.println("le poste a été supprimé");
        }
}