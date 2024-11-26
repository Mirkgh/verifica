/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_marcis_verifica;

/**
 *
 * @author ospite
 */
public class professore1 {
    //dichiarazione delle variabili necessarie per l'esecuzione
    private String materia1;
    String cognomep;
    String materia;
    input_e_media Input = new input_e_media();
    
    //costruttore dove li passo il cognome e la materia
    public professore1(String cognomep, String materia1){
         this.cognomep = cognomep;
         this.materia1 = materia1;
        
    }
    //metodo toString per stampare il costruttore come stringa
    public String toString(){
        return ""+"il professor " +cognomep + " insegna "+ materia1;
    }
}
