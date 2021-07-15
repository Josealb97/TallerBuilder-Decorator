/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;

/**
 *
 * @author joaqu
 */
public class VehiculoDirector {
    private VehiculoBuilder builder;
    
    public VehiculoDirector(VehiculoBuilder builder){
        this.builder = builder;
    }
    
    public void ConstruirVehiculo(){
        builder.DefinirVehiculo();
        builder.ConstruirHabitaculo();
        builder.ConstruirMotor();
        builder.DefinirExtras();
        
    }
    
    public Vehiculo GetVehiculo(){
        return builder.GetVehiculo();
    }
}
