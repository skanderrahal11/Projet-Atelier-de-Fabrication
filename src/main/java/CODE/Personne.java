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
public class Personne {
    //attributs
    private String idpersonne;
    private String nom;
    private String prenom;
    //getter et setter
    public String Getidpersonne (){
        return idpersonne;
    } 
    public void Setidpersonne (String d){
        this.idpersonne=d;
    }
    public String Getnom(){
        return nom;
    }
    public void setnom(String n){
        this.nom=n;
    }
    public String Getprenom(){
        return prenom;
     }
    public void Setprenom(String p){
        this.prenom=p;
    }
    //constructeur
    public Personne (String idpersonne, String nom,String prenom){
        this.idpersonne=idpersonne;
        this.nom=nom;
        this.prenom=prenom;
    } 
    public String AfficherPersonne (){
        return "Personne[idpersonne "+idpersonne+",nom "+nom+",prenom "+prenom;
    }
    
    
    
    
}
