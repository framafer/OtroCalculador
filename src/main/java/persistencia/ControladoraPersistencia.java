
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Operacion;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    OperacionJpaController operacionJpa = new OperacionJpaController();

    public void guardar(Operacion operacion) {
        operacionJpa.create(operacion);
    }

    public List<Operacion> traerOperaciones() {
        return operacionJpa.findOperacionEntities();
    }

    public void borrarOperacion(int num_operacion) {
        try {
            operacionJpa.destroy(num_operacion);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Operacion traerOperacion(int num_operacion) {
        return operacionJpa.findOperacion(num_operacion);
    }

    public void modificarOperacion(Operacion operacion) {
        try {
            operacionJpa.edit(operacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
