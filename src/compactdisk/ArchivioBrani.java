/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compactdisk;
import static compactdisk.EasyInput.*;

/**
 *
 * @author eliasforna
 */
public class ArchivioBrani {
    
    //Dichiarazione degli attributi
    public String nomeBrano;
    public int durataBrano;
    
    //Costruttore
    public ArchivioBrani(String nomeBrano, int durataBrano)
    {
        this.durataBrano = durataBrano;
        this.nomeBrano = nomeBrano;
        
    }
    
    //Modifica titolo
    public String modificaTitolo(String nomeBrano)
    {
        nomeBrano = inputS("Inserisci il nuovo titolo:");
        return nomeBrano;
    }
    //Modifica durata
    public int modificaDurata(int durataBrano)
    {
        durataBrano = inputI("Inserisci la nuova durata:");
        return durataBrano;
    }
   
    
}
