/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoensamblaje;

import patrones.AudiBuilder;
import patrones.CitroenBuilder;
import patrones.VehiculoDirector;
import sinpatron.*;

/**
 *
 * @author david_000
 */
public class DemoEnsamblaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VehiculoDirector directorCitroen = new VehiculoDirector(new CitroenBuilder());
        directorCitroen.ConstruirVehiculo();
        Vehiculo citroen = directorCitroen.GetVehiculo();
        //Mostrar prestaciones del vehiculo
        System.out.println(citroen.getPrestaciones());


        //--------------------------------------------------
        //Definir vehiculo
        VehiculoDirector directorAudi = new VehiculoDirector(new AudiBuilder());
        directorAudi.ConstruirVehiculo();
        Vehiculo audi = directorAudi.GetVehiculo();
        //Mostrar prestaciones del vehiculo
        System.out.println(audi.getPrestaciones());
        
        
        
        //--------------------------------------------------

        //TODO: Agregar accesorios: radio y sensores de retro a v1
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
                
        //Mostrar prestaciones actualizadas del vehiculo
        
        //--------------------------------------------------
        
        //TODO: Agregar accesorios: camara de retro a v2
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
        
        
        //Mostrar prestaciones actualizadas del vehiculo
    }
    
}
