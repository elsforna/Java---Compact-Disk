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
public class CompactDisk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Dichiarazione dell'Array di oggetti
        ArchivioBrani[] canzone = new ArchivioBrani[11];
        //Dichiarazione variabili lavoro
        String inserito = "";
        int durata = 0;
        int i = 0;
        int dim = 11;
        //Variabili Switch
        int numeroSW = 0;
        int numeroSW1 = 0;
        //Variabili modifiche
        String varTempTitolo = "";
        String ins = "";
        int varTempDurata = 0;
        int indexRifDati = 0;
        int insI = 0;
        //Variabili ricerca
        String ricerca = "";
        
        
        //Inserimento dei dati in input
        
        for(i = 1 ; i < dim ; i++)
        {
            inserito = inputS("Inserisci il nome della canzone:" + " " + i);
            durata = inputI("Inserisci la durata della canzone:" + i + "(secondi)");
            canzone[i] = new ArchivioBrani(inserito,durata);
            
        }
        
        //Stampa dei parametri inseriti in Input di ogni brano (oggetto)
        System.out.println("Lista dei nomi e la durata di ogni canzone data in Input");
                            
                            for(i = 1 ; i < dim ; i++)
                            {
                                 System.out.println("Canzone n° " + i +" = " + "Titolo:"+ " " + canzone[i].nomeBrano + " " + " Durata:" + " " + canzone[i].durataBrano + " " + " " +"(secondi)");
                            }
                             //Richiesta all'utente se vuole modificare i parametri inseriti in Input
                            numeroSW = inputI("\n\nVuoi modificare i parametri inseriti in Input?\n\n" + " - Digita 1 per modificarli;\n" + " - Altrimenti digita 2.");
                        
                            switch(numeroSW)
                            {
                                case 1: 
                                        //Scelta dei parametri da modificare
                                        i = 1;
                                        while(true)
                                        {
                                            if(numeroSW1 == 3)
                                                break;
                                            
                                                    numeroSW1 = inputI(" - Digita 1 se vuoi modificare i titoli dei brani;\n" + " - Digita 2 se vuoi modificare le durate dei brani.\n" + " - Digita 3 per terminare le modifiche");
                                                    switch(numeroSW1)
                                                    {
                                                        case 1: 
                                                            indexRifDati = inputI("Inserisci il numero del brano da modificare:");
                                                            varTempTitolo = canzone[i].modificaTitolo(ins);
                                                            canzone[indexRifDati].nomeBrano = varTempTitolo;
                                                            break;
                                                        case 2:
                                                            indexRifDati = inputI("Inserisci il numero del brano da modificare:");
                                                            varTempDurata = canzone[i].modificaDurata(insI);
                                                            canzone[indexRifDati].durataBrano = varTempDurata;
                                                            break;
                                                        case 3:
                                                            System.out.println("#FINE MODIFICHE#");
                                                            break;
                                                        default: System.out.print("Errore");
                                                            break;

                                                    }
                                        
                                            
                            
                                        }
                                        //Stampa dei parametri inseriti in Input di ogni brano (oggetto)
                                        System.out.println("Lista dei nomi e la durata di ogni canzone data in Input");
                            
                                        for(i = 1 ; i < dim ; i++)
                                        {
                                            System.out.println("Canzone n° " + i +" = " + "Titolo:"+ " " + canzone[i].nomeBrano + " " + " Durata:" + " " + canzone[i].durataBrano + " " + " " +"(secondi)");
                                        }
                                    
                                    break;
                                case 2: 
                                        //Ricerca dei brani attraverso il nome per restituire la DURATA
                                        ricerca = inputS("\n\nInserisci il nome del brano da cercare per visualizzare i suoi parametri:");
                                        for(i = 1 ; i < dim ; i++)
                                        {
                                            if(canzone[i].nomeBrano.equals(ricerca))
                                            {
                                                System.out.println("\n\nIl brano trovato è:"+ " " +canzone[i].nomeBrano + "\n" + "Dutara del brano:" + " " + canzone[i].durataBrano);
                                            }
                                        }
                                        
                                    break;
                                default: System.out.println("Errore");

                            }
                                        //Ricerca dei brani attraverso il nome per restituire la DURATA
                                        ricerca = inputS("\n\nInserisci il nome del brano da cercare per visualizzare i suoi parametri:");
                                        for(i = 1 ; i < dim ; i++)
                                        {
                                            if(canzone[i].nomeBrano.equals(ricerca))
                                            {
                                                System.out.println("\n\nIl brano trovato è:"+" "+canzone[i].nomeBrano + "\n" + "Durata del brano:" + " " + canzone[i].durataBrano);
                                            }
                                        }
                            
                             
        
        
    }
    
}
