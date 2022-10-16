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
public class ChefAtelier extends Personne {
    //Constructeur

    public ChefAtelier(String idpersonne, String nom, String prenom) {
        super(idpersonne, nom, prenom);
    }
    //Méthode tostring
    public String toStringChef(){
        return AfficherPersonne();
    }
}
