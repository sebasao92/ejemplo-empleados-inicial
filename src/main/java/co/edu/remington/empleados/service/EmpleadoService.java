package co.edu.remington.empleados.service;

import org.springframework.stereotype.Service;

import co.edu.remington.empleados.model.Empleado;

@Service
public class EmpleadoService {

    public Empleado obtenerEmpleado(String cedula){

        return new Empleado(cedula, "Juan", 200000.0);
    }
}
