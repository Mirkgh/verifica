/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_marcis_verifica;

/**
 *
 * @author ospite
 */
public class professore2 {
    //dichiarazione variabili necessarie
    private String materia2;
    private String cognomep2;
            
    
    //costruttore dove li passo il cognome e la materia
    public professore2(String cognomep2, String materia2){
         this.cognomep2 = cognomep2;
         this.materia2 = materia2;
        
    }
    //metodo toString per stampare il costruttore come stringa
    public String toString(){
        return ""+"il professor " +cognomep2 + " insegna "+ materia2;
    }
}

