package CODE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skander
 */
public class Machine {
    //Déclaration Attributs machine
    public static String refMachine; //Réference machine
    public static String dMachine; //Désignation machine 
    public static String type; //Type machine
    public static String cout; //Cout horaire d'utilisation
    public static String abcisse; //abcisse Machine
    public static String ordonnée; //ordonnée Machine
    public static String durée; //Durée en fonction du produit
    public static String etat; //état de la machine : (en service / hors service)
    
  
    
    //Méthode ToString
        //paramètres de la machine séparés par des "-" en vue d'utiliser des split. 
        public static String ToString(){
        return dMachine+"-"+refMachine+"-"+type+"-"+cout+"-"+abcisse+"-"+ordonnée+"-"+durée+"-"+etat;
    }
        public Machine(String d, String r, String t, String c, String xposition, String yposition , String du, String e){
        refMachine=r;
        dMachine=d;
        type=t;
        cout=c;
        abcisse=xposition;
        ordonnée=yposition;
        durée=du;
        etat=e;
    }
    

        //Fonction  créer Machine
        
        //La fonction ci-dessous est assez difficile à comprendre. En effet, elle est surtout pensée pour correspondre à notre interface graphique. En effet, elle retourne
        //un entier. Cela peut parraitre étrange mais cet entier correspond à une erreur que l'on utilise dans l'interface pour signaler à l'utilisateur qu'un paramètre qu'il 
        //a séléctionné est incorrect.
        
        
        
        public static int setMachine(String d, String r, String t, String c, String xposition, String yposition , String du, String e)throws IOException {
    
        //int nombre est un parammetre qui vaut soit 0 soit 1, si'il vaut 1, alors un des paramètres xpositions, cout, yposition, du n'est pas un float.
        //il est utilisé afin de poursuivre la création de la machine dans la suite du programme. Par défaut, il vaut 0.
        int nombre = 0;
        int erreur;
        if (!(t.equals("manuelle"))&&!(t.equals("numérique"))){ erreur=1;return erreur;} //le type d'une machine peut être soit une commande manuelle, soit numérique. Si le type vaut autre chose alors la fonction retourne 1
        if (!(e.equals("HS"))&&!(e.equals("S"))){ erreur=2;return erreur;} //Nous n'avons pas utiliser 0 et 1 pour l'état mais S et HS, ainsi, si l'état est différent de S ou HS alors la fonction retourne 2;
        if (((t.equals("manuelle"))||(t.equals("numérique")))&&((e.equals("HS"))||(e.equals("S")))){ //Si les deux conditions ci-dessus sont respectés, alors on teste si les paramètres xpositions, cout, yposition sont des float.
       
        //pour vérifier le type de ces paramètres, nous avons utilisé des try / catch. En effet, on essait dans un premier temps de convertir le paramètre en float, si ce n'est pas possible,
        //on recupère l'exception NumberFormatException, ainsi, la fonction retourne 3 et nombre vaut 1. La variable nombre permet d'empêcher la création de la machine si un des paramètre n'est pas un float.
        try 
        {
        Float.valueOf(c.trim());
        Float.valueOf(xposition.trim());
        Float.valueOf(yposition.trim());
        Float.valueOf(du.trim());
        }
        catch (NumberFormatException nfe) 
        {
        erreur = 3;
        nombre =1;
        return erreur;
       
        }
        }
        
        //Si tous les paramètres sont correctes, alors on peut créer la machine.
        //le fichier texte de la forme dMachine(refMachine).txt contient tous les paramètres de cette machine séparés par des "-" 
        if (((t.equals("manuelle"))||(t.equals("numérique")))&&((e.equals("HS"))||(e.equals("S")))&&(nombre==0)){
        
        File fichier = new File(Atelier.lien()+"Equipement/Machines/"+d+"("+r+").txt");
        FileWriter writer = new FileWriter(fichier);
        Machine machine = new Machine(r,d,t,c,xposition,yposition,du,e);
        String contenu = machine.ToString();
        writer.write(contenu); 
        writer.flush();
        writer.close();
        return 0; //le programme retourne 0, cela permet d'indiquer à l'utilisateur la création de la machine
        }
        return 10; //le programme retourne 10 par défaut, cela n'arrive jamais. 
        }

        
        //Méthode supprimer machine
        //Cette méthode permet de supprimer le fichier texte correspondant à la machine
        public static void supMachine(String machine){ //machine contient designation+(reference).txt
        
        
        File fichier = new File(Atelier.lien()+"Equipement/Machines/"+machine);
        fichier.delete();
        System.out.println("la machine a été supprimée");
        }
}
