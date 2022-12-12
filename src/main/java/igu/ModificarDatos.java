
package igu;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Controladora;
import logica.Operacion;


public class ModificarDatos extends javax.swing.JFrame {

    Operacion operacion = new Operacion();
    Controladora control = null;
    int num_operacion;
     
        
    
    public ModificarDatos(int num_operacion) {
        control = new Controladora();
        initComponents();
        cargarDatos(num_operacion);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextOperando1 = new javax.swing.JTextField();
        jTextOperando2 = new javax.swing.JTextField();
        jTextResultado = new javax.swing.JTextField();
        jB_Sumar = new javax.swing.JButton();
        jB_Restar = new javax.swing.JButton();
        jB_Multiplicar = new javax.swing.JButton();
        jB_Dividir = new javax.swing.JButton();
        jB_Limpiar = new javax.swing.JButton();
        jB_GuardarCambios = new javax.swing.JButton();
        jB_IrABaseDeDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Modificar operación");

        jLabel2.setText("Operando 1");

        jLabel3.setText("Operando 2");

        jLabel4.setText("Resultado");

        jTextOperando1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextOperando1FocusLost(evt);
            }
        });
        jTextOperando1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOperando1ActionPerformed(evt);
            }
        });

        jTextOperando2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextOperando2FocusLost(evt);
            }
        });
        jTextOperando2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextOperando2ActionPerformed(evt);
            }
        });

        jTextResultado.setEditable(false);
        jTextResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextResultadoActionPerformed(evt);
            }
        });

        jB_Sumar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB_Sumar.setText("+");
        jB_Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SumarActionPerformed(evt);
            }
        });

        jB_Restar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB_Restar.setText("-");
        jB_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RestarActionPerformed(evt);
            }
        });

        jB_Multiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB_Multiplicar.setText("*");
        jB_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_MultiplicarActionPerformed(evt);
            }
        });

        jB_Dividir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jB_Dividir.setText("/");
        jB_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DividirActionPerformed(evt);
            }
        });

        jB_Limpiar.setText("Limpiar");
        jB_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LimpiarActionPerformed(evt);
            }
        });

        jB_GuardarCambios.setText("Guardar cambios");
        jB_GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarCambiosActionPerformed(evt);
            }
        });

        jB_IrABaseDeDatos.setText("Ir a Base de Datos");
        jB_IrABaseDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_IrABaseDeDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextOperando1)
                            .addComponent(jTextOperando2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_Sumar)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Restar)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Multiplicar)
                                .addGap(18, 18, 18)
                                .addComponent(jB_Dividir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextResultado))))
                .addGap(292, 292, 292))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jB_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jB_GuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jB_IrABaseDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextOperando1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextOperando2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Sumar)
                            .addComponent(jB_Restar)
                            .addComponent(jB_Multiplicar)
                            .addComponent(jB_Dividir))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Limpiar)
                    .addComponent(jB_GuardarCambios)
                    .addComponent(jB_IrABaseDeDatos))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextResultadoActionPerformed

    private void jTextOperando1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOperando1ActionPerformed
        NumberFormat frenchFormatter = NumberFormat.getInstance(new Locale("fr", "FR"));
        Number number;
        try {
            number = frenchFormatter.parse(this.jTextOperando1.getText());
            double d = number.doubleValue();
            String cadena = frenchFormatter.format(number);
            jTextOperando1.setText(cadena);
            this.operacion.setOperando1(d);
        } catch (ParseException ex) {
            this.mostrarMensaje("Debe entrar solo números", "Error", "Error Al introducir Número");
            jTextOperando1.setText("");
            this.operacion.setOperando1((Double) null);
        }
    
    }//GEN-LAST:event_jTextOperando1ActionPerformed

    private void jTextOperando2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextOperando2ActionPerformed
        NumberFormat frenchFormatter = NumberFormat.getInstance(new Locale("fr", "FR"));
        Number number;
        try {
            number = frenchFormatter.parse(this.jTextOperando2.getText());
            double d = number.doubleValue();
            String cadena = frenchFormatter.format(number);
            jTextOperando2.setText(cadena);
            this.operacion.setOperando2(d);
        } catch (ParseException ex) {
            this.mostrarMensaje("Debe entrar solo números", "Error", "Error Al introducir Número");
            jTextOperando2.setText("");
            this.operacion.setOperando2((Double) null);
        }
    }//GEN-LAST:event_jTextOperando2ActionPerformed

    private void jTextOperando1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOperando1FocusLost
        NumberFormat frenchFormatter = NumberFormat.getInstance(new Locale("fr", "FR"));
        Number number;
        try {
            number = frenchFormatter.parse(this.jTextOperando1.getText());
            double d = number.doubleValue();
            String cadena = frenchFormatter.format(number);
            jTextOperando1.setText(cadena);
            this.operacion.setOperando1(d);
        } catch (ParseException ex) {
            this.mostrarMensaje("Debe entrar solo números", "Error", "Error Al introducir Número");
            jTextOperando1.setText("");
            this.operacion.setOperando1((Double) null);
        }
    }//GEN-LAST:event_jTextOperando1FocusLost

    private void jTextOperando2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextOperando2FocusLost
        NumberFormat frenchFormatter = NumberFormat.getInstance(new Locale("fr", "FR"));
        Number number;
        try {
            number = frenchFormatter.parse(this.jTextOperando2.getText());
            double d = number.doubleValue();
            String cadena = frenchFormatter.format(number);
            jTextOperando2.setText(cadena);
            this.operacion.setOperando2(d);
        } catch (ParseException ex) {
            this.mostrarMensaje("Debe entrar solo números", "Error", "Error Al introducir Número");
            jTextOperando2.setText("");
            this.operacion.setOperando2((Double) null);
        }
    }//GEN-LAST:event_jTextOperando2FocusLost

    private void jB_SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SumarActionPerformed
        
        if(operacion != null) {
            operacion.sumar();
            this.ponerValorEnJText(this.operacion.getResultado(), jTextResultado);
        }

    }//GEN-LAST:event_jB_SumarActionPerformed

    private void jB_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RestarActionPerformed
        if(operacion != null){
            operacion.restar();
            this.ponerValorEnJText(this.operacion.getResultado(), jTextResultado);
        }
    }//GEN-LAST:event_jB_RestarActionPerformed

    private void jB_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_MultiplicarActionPerformed
        if(operacion != null){
            operacion.multiplicar();
            this.ponerValorEnJText(this.operacion.getResultado(), jTextResultado);
        }
    }//GEN-LAST:event_jB_MultiplicarActionPerformed

    private void jB_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DividirActionPerformed
        if(operacion != null & operacion.getOperando2() != 0){
            operacion.dividir();
            this.ponerValorEnJText(this.operacion.getResultado(), jTextResultado);
        }
    }//GEN-LAST:event_jB_DividirActionPerformed

    private void jB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LimpiarActionPerformed
        //this.operacion.setOperando1(null);
        //this.operacion.setOperando2(0);
        //this.operacion.setResultado(0);
        
        //this.operacion = null;
        this.operacion.setOperando1(0);
        this.operacion.setOperando2(0);
        this.operacion.setResultado(0);
        this.operacion.setTipoOperacion((String) null);
        jTextOperando1.setText("");
        jTextOperando2.setText("");
        jTextResultado.setText("");
        
    }//GEN-LAST:event_jB_LimpiarActionPerformed

    private void jB_GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarCambiosActionPerformed
       
        double oper1 = operacion.getOperando1();
        double oper2 = operacion.getOperando2();
        double result = operacion.getResultado();
        String tipooper = operacion.getTipoOperacion();
        
        control.modificarOperacion(operacion,oper1,oper2,tipooper,result);
        
        this.mostrarMensaje("Operación editada satisfactoriamente", "Info", "Resulatado de la Edición");
        
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_jB_GuardarCambiosActionPerformed

    private void jB_IrABaseDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_IrABaseDeDatosActionPerformed
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jB_IrABaseDeDatosActionPerformed

    
    public void mostrarMensaje(String Mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(Mensaje);
        if(tipo.equalsIgnoreCase("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equalsIgnoreCase("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    
    public String ponerValorEnJText(double valor,javax.swing.JTextField jtext ){
        NumberFormat frenchFormatter = NumberFormat.getInstance(new Locale("fr", "FR"));
        Number number;
        number = valor;
        String cadena = frenchFormatter.format(number);
        jtext.setText(cadena);
        return cadena;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Dividir;
    private javax.swing.JButton jB_GuardarCambios;
    private javax.swing.JButton jB_IrABaseDeDatos;
    private javax.swing.JButton jB_Limpiar;
    private javax.swing.JButton jB_Multiplicar;
    private javax.swing.JButton jB_Restar;
    private javax.swing.JButton jB_Sumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextOperando1;
    private javax.swing.JTextField jTextOperando2;
    private javax.swing.JTextField jTextResultado;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_operacion) {
        operacion = control.traerOperacion(num_operacion);
        jTextOperando1.setText(this.ponerValorEnJText(operacion.getOperando1(), jTextOperando1));
        jTextOperando2.setText(this.ponerValorEnJText(operacion.getOperando2(), jTextOperando2));
        jTextResultado.setText(this.ponerValorEnJText(operacion.getResultado(), jTextResultado));
        
    }
    
    
    
}
