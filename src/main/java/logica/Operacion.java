package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity 
public class Operacion implements Serializable {
    @Id
    @GeneratedValue()
    int id;
    double operando1;
    double operando2;
    String tipoOperacion = "";
    double resultado;
    
   
    public Operacion() {
    }

    public Operacion(int id, double operando1, double operando2, String tipoOperacion, double resultado) {
        this.id = id;
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.tipoOperacion = tipoOperacion;
        this.resultado = resultado;
    }
    
    public Operacion(double operando1, double operando2, String tipoOperacion, double resultado) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.tipoOperacion = tipoOperacion;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void sumar(){
        double result = this.operando1 + this.operando2;
        this.setResultado(result);
        tipoOperacion = "SUMAR";
    }
    
    public void restar(){
        double result = this.operando1 - this.operando2;
        this.setResultado(result);
        tipoOperacion = "RESTAR";
    }
    
    public void dividir(){
        
        try{
            double result = this.operando1/this.operando2;
            this.setResultado(result);
            tipoOperacion = "DIVIDIR";
        }
        catch(Exception e){
            System.out.print("No puede dividir por cero");
        }
    }
    
    public void multiplicar(){
        double result = this.operando1 * this.operando2;
        this.setResultado(result);
        tipoOperacion = "MULTIPLICAR";
    }
    
    
}
