/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author joaqu
 */
public class CitroenBuilder extends VehiculoBuilder{

    @Override
    public void DefinirVehiculo() {
        v = new Vehiculo();
        v.marca = "Citroen";
        v.modelo = "Xsara Picasso";
        
    }

    @Override
    public void ConstruirHabitaculo() {
        Carroceria c = new Carroceria();
        c.habitaculoReforzado = false;
        c.material = "acero";
        c.tipoCarroceria = "monovolumnen";
        v.tipoCarroceria = c;
        v.color = "negro";
    }

    @Override
    public void ConstruirMotor() {
        v.motor = new MotorDiesel();
    }

    @Override
    public void DefinirExtras() {
        v.direccionAsistida = false;
    }
    
}
