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
public class AudiBuilder extends VehiculoBuilder{

    @Override
    public void DefinirVehiculo() {
        v = new Vehiculo();
        v.marca = "Audi";
        v.modelo = "A3 Sportback";
    }

    @Override
    public void ConstruirHabitaculo() {
        Carroceria c = new Carroceria();
        c.habitaculoReforzado = true;
        c.material = "fibra de carbono";
        c.tipoCarroceria = "deportivo";
        v.tipoCarroceria = c;
        v.color = "plata cromado";
    }

    @Override
    public void ConstruirMotor() {
        v.motor = new MotorDiesel();
    }

    @Override
    public void DefinirExtras() {
        v.direccionAsistida = true;
    }
    
}
