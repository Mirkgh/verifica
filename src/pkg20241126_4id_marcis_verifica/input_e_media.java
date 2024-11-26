/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_marcis_verifica;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class input_e_media {
    //dichiarazione delle variabili necessarie
    private String nomestudente;
    private String cognomestudente;
    private double mediatotale;
    
   

    private int voto1;
    private int voto2;
    private int voto3;
    
   
    
    //metodo input utente dove l'utente inserira la informazioni dello studente
    public void inputstudente() {
        Scanner studente = new Scanner(System.in);
        System.out.println("inserisci il nome dello studente \n");
        nomestudente = studente.nextLine();
        
        Scanner studentec = new Scanner(System.in);
        System.out.println("inserisci il cognome dello studente \n");
        cognomestudente = studentec.nextLine();
    }
    //metodo per il voto di matematica che verrà inserito dall'utente e verra stampato 
        public void votomatematica() {
        Scanner Voto1 = new Scanner(System.in);
        System.out.println("inserisci il primo voto di matematica \n");
        voto1 = Voto1.nextInt();
        
        
   
        
        System.out.println("il voto dello studente in matematica e \n");
        System.out.println("\n" +voto1);
        
        
}
         //metodo per il voto di informatica che verrà inserito dall'utente e verra stampato 
        public void votoinformatica() {
        Scanner Voto1 = new Scanner(System.in);
        System.out.println("inserisci il voto di informatica \n");
        voto2 = Voto1.nextInt();
        
        
      
        
        System.out.println("il voto dello studente in informatica e \n");

        System.out.println(voto2);
         

        
        
        
} //metodo per il voto di storia che verrà inserito dall'utente e verra stampato 
        public void votostoria() {
        Scanner Voto1 = new Scanner(System.in);
        System.out.println("inserisci il voto di storia \n");
        voto3 = Voto1.nextInt();
        
        
 
        
        System.out.println("il voto dello studente in storia e \n");

        System.out.println(voto3);
               
}
        //metodo per la media che calcola la media tramite la forumla e se la maedia totale è minore di 6 stamperà che lo studente ha il debito
        public void mediagenerale() {
            mediatotale = (voto1 + voto2 + voto3)/3;
            System.out.println("la media totale e " +mediatotale);
            
             if(mediatotale < 6) {
            System.out.println("lo studente ha il debito ");
        }else {
            System.out.println("lo studente non ha il debito");
        }
        }
        
        
        
        
        
        
    }
   
    
