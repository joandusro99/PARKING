/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueadero;

/**
 *
 * @author Estudiantes
 */
public class CeladorGrosero {
   
   String saludarh(){
        return "Hola mi doctor.";
    }
    String saludarm(){
        return "Que cuerpazo miamol";
    }
    String sobrio(){
        return "Buenos días";
    }
    String ebrio(){
        return "Largo de acá lokitaaa";
    }
    String gafas(){
        return "Recuerde sus gafas";
    }
    
    String saludar(int sexo, int nalcohol, int gafas){
        if (sexo==0){
            return saludarm();            
        }else{
            return saludarh();
        }
        if (nalcohol>1){
            return ebrio();
        }else{
            return sobrio();
        }
        if (gafas==1){
            return gafas();
        }else{
            return "";
        }
    }
        
}
