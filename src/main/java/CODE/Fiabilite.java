/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phili
 */
public class Fiabilite {
    
    public static int getTime(){
        Date aujourdhui = new Date();

        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
        DateFormat.SHORT,
        DateFormat.SHORT);
        System.out.println(shortDateFormat.format(aujourdhui));
        String [] tableauDate = shortDateFormat.format(aujourdhui).split("/");
        int jour = Integer.parseInt(tableauDate[0]);
        int mois = Integer.parseInt(tableauDate[1]);
        int sommejourMois = 0;
        int jourMois = 0;
        int i;
        for (i=0 ; i<mois ; i++){
        if ((mois == 1) || (mois == 3) || (mois == 5) || (mois == 7) || (mois == 8) || (mois == 10) || (mois == 12)){jourMois = 31;}
        if ((mois == 9) || (mois == 11) || (mois == 4) || (mois == 6)) {jourMois = 30;}
        if (mois == 2){jourMois = 28;}  
        sommejourMois = sommejourMois+jourMois;
        }
        
        String [] date = tableauDate[2].split("\\s+");
        String [] date1 = date[1].split(":");
        int heures = Integer.parseInt(date1[0]);
        int minutes= Integer.parseInt(date1[1]);
        
        int dateFinale = (minutes + 60*heures + 24*60*jour + 24*60*sommejourMois);
        System.out.println(dateFinale);
        return dateFinale;
        
    }
    
    public static void addTimeMachine(String dMachine) throws IOException{
        File fichier = new File(Atelier.lien()+"Equipement/Fiabilité/"+(dMachine)+".txt");
        FileWriter writer = new FileWriter(fichier);
        String contenu = ((dMachine+"-"+getTime())+"-"+0);
        writer.write(contenu); 
        writer.flush();
        writer.close();
        
    }
    
    public static void panneMachine(String dMachine, String refMachine) throws IOException{
        File fiabilitémachine = new File(Atelier.lien()+"Equipement/Fiabilité/"+(dMachine)+".txt");
        BufferedReader buff=new BufferedReader(new FileReader(fiabilitémachine));
        String ligne;
            while ((ligne=buff.readLine())!=null){
                System.out.println(ligne);
                String contenu[]  = ligne.split("-");
      
                contenu[2] = String.valueOf(getTime());
                FileWriter writer = new FileWriter(fiabilitémachine);
                String contenu1 =contenu[0]+"-"+contenu[1]+"-"+contenu[2];
                
                
        writer.write(contenu1); 
        writer.flush();
        writer.close();
    }
        
    }
    
    
    public static double affichageFiabilité(String dMachine) throws FileNotFoundException, IOException{
        double fiabilité = 0;
        int tempsactuel = getTime();
        File fiabilitémachine = new File(Atelier.lien()+"Equipement/Fiabilité/"+(dMachine)+".txt");
        BufferedReader buff =new BufferedReader(new FileReader(fiabilitémachine));
        try {
            buff = new BufferedReader(new FileReader(fiabilitémachine));
        } catch (FileNotFoundException ex) {
            System.out.println("cette machine n'existe pas");
        }
        
        String ligne;
            while ((ligne=buff.readLine())!=null){
                System.out.println(ligne);
                String contenu[]  = ligne.split("-");
                fiabilité = (((Integer.parseInt(contenu[2])-Integer.parseInt(contenu[1]))*100)/(tempsactuel-Integer.parseInt(contenu[1])));
                }
    
    return fiabilité;
    }
}
    
    
    

