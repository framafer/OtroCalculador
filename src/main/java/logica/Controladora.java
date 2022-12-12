
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(double oper1, double oper2, String tipooper, double result) {
        Operacion operacion = new Operacion(oper1,oper2,tipooper,result);
        controlPersis.guardar(operacion);
        
    }

    public List<Operacion> traerOperaciones() {
        return controlPersis.traerOperaciones();
    }

    public void borraOperacion(int num_operacion) {
        controlPersis.borrarOperacion(num_operacion);
    }

    public Operacion traerOperacion(int num_operacion) {
        return controlPersis.traerOperacion(num_operacion);
    }

    public void modificarOperacion(Operacion operacion,double oper1, double oper2, String tipooper, double result) {
        operacion.setOperando1(oper1);
        operacion.setOperando2(oper2);
        operacion.setResultado(result);
        operacion.setTipoOperacion(tipooper);
        controlPersis.modificarOperacion(operacion);
    }

    
}
