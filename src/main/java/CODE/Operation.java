package CODE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CODE.Lire;
import CODE.Equipement;
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

/**
 *
 * @author Skander
 */
public class Operation {
    //attributs classe opération
    public static String refOperation;
    public static String dOperation;
    public static String dEquipement; 
    public static String duréeOperation;
    public static String coutOperation;
    
   
 
    //Constructeurs
    
    public Operation(String dO, String rO, String dE, String duO, String coutO)
    {
        dEquipement = dE;
        refOperation = rO;
        dOperation = dO;
        coutOperation = coutO;
        duréeOperation = duO;
       
    }
    
    
    //Méthode Tostring
    
    
    public String toString(){
        return(dOperation+"-"+refOperation+"-"+dEquipement+"-"+duréeOperation+"-"+coutOperation);
    }

    
    
    public static String setrefOperation(){
        System.out.println("veuillez entrer la référence de l'opération");
        refOperation = Lire.S();
        return refOperation ; 
    }
   
    
    
    public static String setdOperation(){
        System.out.println("veuillez entrer la désignation de l'opération");
        dOperation = Lire.S();
        return dOperation ; 
    }

    
    
    public static String setcoutOperation(){
       
        System.out.println("veuillez entrer la durée de l'opération");
        coutOperation = Lire.S();
        return coutOperation;
    }
    
    
    public static String setduréeOperation(/*String [][] refE, String [][] refM*/)throws IOException {
        System.out.println("veuillez entrer la durée de l'opération");
        duréeOperation = Lire.S();
        return duréeOperation;
      
    }
    
    //Fonnction création de l'operation associée à une machine.
    //cette fonction créé une operation en récupérant le cout, la durée et la sésignation de la machine. Pour cela, on récupère le nom du fichier texte de la machine et les différents
    //paramètres grâce à la fonction paramètreMachine 
    public static String setOperationMachine(String dOperation, String refOperation, String machine, String durée) throws IOException, ClassNotFoundException{
        
        String cout = Equipement.paramètreMachine(machine,"cout");
        String dEquipement = Equipement.paramètreMachine(machine,"dMachine");
        Operation operationMachine = new Operation(dOperation,refOperation,dEquipement,durée,cout);
        return operationMachine.toString();
    }   
    
    
    //Fonction création de l'opération associée à un poste.
    //pour ce qui est d'un poste, on récupère le cout et la durée grace à la fonction paramètrePoste.
    //En revanche, on doit effectuer la somme de ces différents paramètres, or, comme ce sont des chaines de caractères, il faut les convertirs en float.
    //Le problème de conversion ne se pose pas car il a été écarté dans la fonction setMachine. 
    public static String setOperationPoste(String dOperation, String refOperation, String poste, String durée) throws IOException{
            
        float cout1 = Equipement.paramètrePoste(poste,"cout");
        String cout = String.valueOf(cout1);
        System.out.println(cout); 
        //Cependant, une fois les paramètres durée et cout récupérés et additionés, il nous manque la designation du poste.
        //Pour le récupérer, nous avons choisit d'effectuer un split du nom du fichier texte selon ")". On a alors un tableau contenant dPoste et refPoste).text.
        //la première valeur du tableau correspond donc à la désignation. Cette manière de procéder n'est pas forcément la plus optimale mais elle a en revanche l'avantage de fonctionner.
        String fichierSplit [] = poste.split("\\(");
        String dEquipement = fichierSplit[0];
        Operation operationMachine = new Operation(dOperation,refOperation,dEquipement,durée,cout);
        return operationMachine.toString();
    
            
         } 
        }
        
       
    
    