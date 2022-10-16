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

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Equipement {
   
   
        //Fonction d'affichage des Equipements : 
        //Ces fonctions permettent d'afficher les n ième equipements, ces fonctions sont utilisés afin d'afficher les equipements dans l'interface graphique.
        //Exemple : si la machine n°2 (dans le repertoire des machine) est une scie de reference 001, alors affichageMachine(2) retourne "scie(001).txt"
    
            //Fonction affichage machine
        
            public static String affichageMachine(int position){
        
                try {File repertoireMachines = new File(Atelier.lien()+"Equipement/Machines/"); //repertoire des machines
                String [] listeMachines = repertoireMachines.list();
                return listeMachines[position-1];}
                catch (Exception e){return "vide";}
            }
   
            //Fonction affichage poste
        
            public static String affichagePoste(int position){
        
        try {File repertoirePoste = new File(Atelier.lien()+"Equipement/Postes/"); //repertoire des machines
        String [] listePoste = repertoirePoste.list();
        return listePoste[position-1];}
        catch (Exception e){return "vide";}
        }
       
            
        //Fonction nombreMachine
        //Cette fonction retourne le nombre de machines dans le repertoire.
        //Nous n'avons pas utiliser la fonction nombrePoste dans ce programme
        public static int nombreMachines(){
        
        File repertoireMachines = new File(Atelier.lien()+"Equipement/Machines/"); //repertoire des machines
        String [] listeMachines = repertoireMachines.list();
        int n = listeMachines.length;
        return n;
        }
        
        
        //Fonctions paramètres Equipements
        //Ces deux fonctions sont les plus importantes de cette classe. Elles permettent de récupérer un paramètre dans un fichier texte. En effet, afin de sauvegarder
        //les variables de notre projet, nous avons utilisé des fichiers texte, à l'intérieur des fichiers texte, nous avons séparés les paramètres des equipement pas des "-".
        //Ainsi, ces fonctions permettent de récupérer ces paramètre en utilisant la fonction split
        
        
        
        //Fonction paramètre Machine
        //Pour utiliser cette fonction, il faut connaitre le nom du fichier de la machine (variable "machine" sous la forme machine = dMachine(refMachine).txt) ) 
        //Enfin, on choisit le paramètre voulu (voir les paramètres présents dans le switch de la fonction
        public static String paramètreMachine(String machine, String paramètre) throws FileNotFoundException, IOException {
        
        File paramètremachine = new File(Atelier.lien()+"Equipement/Machines/"+machine);
           
            
            int resultat = 0;
            switch(paramètre) {
            
                case "refMachine" : resultat = 0; break;
                case "dMachine" : resultat = 1; break;
                case "type" : resultat = 2; break;
                case "cout" : resultat = 3; break;
                case "abcisse" : resultat = 4; break;
                case "ordonée" : resultat = 5; break;
                case "durée" : resultat = 6; break;
                case "état" : resultat = 7; break;
                default : System.out.println("erreur, ce paramètre n'est pas valide"); break;
            }   
            String ligne;

            
            BufferedReader buff=new BufferedReader(new FileReader(paramètremachine));
            String contenu1[] = new String[8];
            while ((ligne=buff.readLine())!=null){
                System.out.println(ligne);
                String contenu[]  = ligne.split("-");
                int i;
                for (i=0 ; i<8 ; i++){contenu1[i]=contenu[i];System.out.println(contenu1[i]);}       
                }
        
        return contenu1[resultat];
        }
        
        
        //Fonction paramètre Poste
        //Cette fonction a le même objectif que celle ci-dessus, en revanche, elle reste relativement différente. En effet, celle-ci ne retourne que le cout et la durée TOTALE d'un
        //poste contenant x machines. Dans un fichier texte d'un poste, les machines sont séparés par des =. On utilise alors des boucles pour obtenir un premier tableau en fonction des =
        //avec des splits, puis, on utilise à nouveau split selon les -. Ensuite, on effectue la somme du cout des machines du poste où la somme des durée selon le choix de l'utilisateur. 
        public static float paramètrePoste(String poste, String paramètre) throws FileNotFoundException, IOException {
            
            
            File paramètreposte = new File(Atelier.lien()+"Equipement/Postes/"+poste);
            
            int resultat = 0;
            switch(paramètre) {
     
                case "cout" : resultat = 3; break; 
                case "durée" : resultat = 6; break;
                
                default : System.out.println("erreur, ce paramètre n'est pas valide"); break;
            }   
            System.out.println(resultat);
            String ligne;
           
            
            BufferedReader buff1=new BufferedReader(new FileReader(paramètreposte));
            float somme = 0;
            
            while ((ligne=buff1.readLine())!=null){
                System.out.println(ligne);
                String[] contenu  = ligne.split("=");
                int i;
                for (i=0 ; i<contenu.length ; i++){System.out.println(contenu[i]);}
            
             
                for (i=0 ; i<contenu.length ; i++){
                    String[] paramètres = contenu[i].split("-");
                    float parametre = Float.valueOf(paramètres[resultat]);
                    somme = somme + parametre;
                    
                }
               
             
                }
                return somme; 
                }
        
        
        
        }