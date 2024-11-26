/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_marcis_verifica;

/**
 *
 * @author ospite
 */
public class professore3 {
    //dichiarazione variabili necessarie
    private String materia3;
    private String cognomep3;
    
    //costruttore dove li passo cognome e materiaq
    public professore3(String cognomep3, String materia3){
         this.cognomep3 = cognomep3;
         this.materia3 = materia3;
        
    }
   //metodo toString per stampare il costruttore come stringa
    public String toString(){
        return ""+"il professor " +cognomep3 + " insegna "+ materia3;
    }
}
