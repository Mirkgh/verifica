/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241126_4id_marcis_verifica;

/**
 *
 * @author ospite
 */
public class Main {

    /**
     * Mirko Marcis 4INFD 
     * Progetta e definisci il codice per un programma in linguaggio Java che gestisca una scuola con studenti e docenti. 
     * Ogni studente ha cognome, nome, e 3 tre voti (1 per ogni materia), mentre ogni docente ha un cognome e una materia che insegna
     * 
     */
    public static void main(String[] args) {
        professore1 prof1 = new professore1("rossi", "matematica");//costruttore prof1 dove gli passo il cognome e la materia
        System.out.println(prof1);//stampa tramite toString
        
        professore2 prof2 = new professore2("torsello", "informatica");//costruttore prof2 dove gli passo il cognome e la materia
        System.out.println(prof2);//stampa tramite toString
        
        professore3 prof3 = new professore3("eposito", "storia");//costruttore prof3 dove gli passo il cognome e la materia
        System.out.println(prof3);//stampa tramite toString
        
        input_e_media info = new input_e_media();//creazione del oggetto della classe input_e_medua
        
        info.inputstudente();//richiamo dell input dell utente
        
        info.votomatematica(); //richiamo del metodo per i voti di matematica
        info.votoinformatica(); //richiamo del metodo per voti di informatica
        info.votostoria(); //richiamo del metodo per i voti di storia
        info.mediagenerale(); //richiamo del metodo per la media generale
    }
    
}
