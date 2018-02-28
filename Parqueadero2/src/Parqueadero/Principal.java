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
public class Principal {

    public static void main(String[] args) {

        CeladorGrosero miCelaG = new CeladorGrosero();
        miCelaG.saludar="hola";
        miCelaG.adular="Hola mi Doctor";
        miCelaG.piropo="Tienes mas patas que friby";

        Propietario Julio = new Propietario();
        Julio.genero = "Hombre";
        Julio.nivelAlcohol = 0;

        Propietario David = new Propietario();
        David.genero = "hombre";
        David.nivelAlcohol = 5;

        Propietario Camila = new Propietario();
        Camila.genero = "mujer";
        Camila.nivelAlcohol = 2;

        Propietario Laura = new Propietario();
        Laura.genero = "mujer";
        Laura.nivelAlcohol = 0;

    }

}
