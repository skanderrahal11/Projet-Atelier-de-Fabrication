package CODE;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
public class Gamme {
    
    //attributs classe Gamme
    public static String refGamme;
    public static String dGamme;
    public static String[] listeOperations;
    public static String[] listeEquipements;
    
    //constructeur
    public Gamme(String rG, String[] lO, String[] lE, String dG)
    {
    refGamme=rG;
    listeOperations=lO;
    listeEquipements=lE;
    dGamme=dG;
    }

   

    //Fonction supprimmer gamme
    //cette fonction permet de supprimer le fichier texte d'une gamme connaissant la designation et la référence de cette dernière. 
    public static void supGamme(String r, String d){
 
        File fichier = new File(Atelier.lien()+"Gammes/"+d+"("+r+").txt");
        fichier.delete();
        System.out.println("La gamme a été supprimée");
        }
  
    public void calculerCout (){
        
        
     
   
    }
    
     public void calculerDuree (){
        
        
     
   
    }
    
    //Fonction setGamme
    //Cette fonction permet de créer un fichier texte de la forme (designationGamme(referenceGamme).txt) 
    public static void setGamme(String d, String r) throws IOException{
        
    // création du fichier dans le répertoire ci dessous, dans le fichier Gammes. Ce fichier porte comme nom la designation et la référence de la gamme
    File fichier = new File(Atelier.lien()+"Gammes/"+d+"("+r+").txt");
    PrintWriter out = new PrintWriter(new FileWriter(fichier, true)) ;    }
    
    
    //Fonctions ajouter Operation
    //Ces fonctions permettent d'ajouter une operation à la gamme, il y'en a deux selon que l'on ajoute une machine ou un poste 
    //Ces deux fonctions sont quasiment identiques mis à part l'utilisation de deux fonctions différentes : setOpertationMachine et setOperationPoste 
    
   public static void addOperationMachine(String dGamme, String refGamme, String dOperation, String refOperation, String machine, String durée) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File fichier = new File(Atelier.lien()+"Gammes/"+dGamme+"("+refGamme+").txt");
        
        FileWriter writer = new FileWriter(fichier, true);
        String contenu = Operation.setOperationMachine(dOperation, refOperation, machine, durée);
        writer.write(contenu+"="); 
        writer.flush();
        writer.close();
        }
    
   public static void addOperationPoste(String dGamme, String refGamme, String dOperation, String refOperation, String poste, String durée) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File fichier = new File(Atelier.lien()+"Gammes/"+dGamme+"("+refGamme+").txt");
        
        FileWriter writer = new FileWriter(fichier, true);
        String contenu = Operation.setOperationPoste(dOperation, refOperation, poste, durée);
        writer.write(contenu+"="); 
        writer.flush();
        writer.close();
        }
    
    
    
    
}