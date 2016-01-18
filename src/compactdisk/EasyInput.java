/*
Classe che permette di effettuare l'input da tastiera in modo molto easy u.u
Per ora ci sono i metodi:
    InputS (restituisce stringa)
    InputI (restituisce intero)
                                        BY Nicolò Vescera (ncvescera on GitHub)
*/
package compactdisk;

import java.io.*;

public class EasyInput {
    public static String inputS(String arg){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        System.out.println(arg);
        try{
                String letto = tastiera.readLine();
                return letto;
                //System.out.println(letto);

            }
            catch(Exception e){
                System.out.println("ERRORE");
                return "";
            }
        
    }
    
    public static int inputI(String arg){
        String input = inputS(arg);
        int re = 0;
        try{
            re = Integer.parseInt(input);   
        }
        catch(Exception e){
            System.err.println("Error! Unparsable value");   
        }
        return re;
    }
    
    public static float inputF(String arg){
        String input = inputS(arg);
        float parse = 0;
        try{
            parse = Float.parseFloat(input);
        }
        catch (Exception e){
            System.err.println("Error! Unparsable value.");
        }
        return parse;
    }
}
