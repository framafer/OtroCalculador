
package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Operacion;


public class VerDatos extends javax.swing.JFrame {

Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOperaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jB_Editar = new javax.swing.JButton();
        jB_Eliminar = new javax.swing.JButton();
        jB_VolverACalculadora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaOperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaOperaciones);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Operaciones guardadas en la BD");

        jB_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-edit-property-48.png"))); // NOI18N
        jB_Editar.setText("Editar");
        jB_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditarActionPerformed(evt);
            }
        });

        jB_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-broom-with-a-lot-of-dust-48.png"))); // NOI18N
        jB_Eliminar.setText("Eliminar");
        jB_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EliminarActionPerformed(evt);
            }
        });

        jB_VolverACalculadora.setText("Volver a Calculadora");
        jB_VolverACalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_VolverACalculadoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_VolverACalculadora)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_Eliminar)
                        .addGap(67, 67, 67)
                        .addComponent(jB_Editar)
                        .addGap(57, 57, 57)
                        .addComponent(jB_VolverACalculadora)
                        .addGap(132, 132, 132))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditarActionPerformed
        
        if(tablaOperaciones.getRowCount() > 0){
            if(tablaOperaciones.getSelectedRow()!=-1){
                int num_operacion = Integer.parseInt(String.valueOf(tablaOperaciones.getValueAt(tablaOperaciones.getSelectedRow(),0)));
                ModificarDatos pantalla = new ModificarDatos(num_operacion);
                pantalla.setVisible(true);
                pantalla.setLocationRelativeTo(null);
                this.setVisible(false);
                
            }
            else{
                this.mostrarMensaje("Debe seleccionar alguna Operación para eliminar", "Error", "Error al Eliminar");
            }
        }
        else{
            this.mostrarMensaje("No hay Datos para eliminar", "Error", "Error al Eliminar");
        }
        
        
        
        
    }//GEN-LAST:event_jB_EditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jB_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EliminarActionPerformed
        if(tablaOperaciones.getRowCount() > 0){
            if(tablaOperaciones.getSelectedRow()!=-1){
                int num_operacion = Integer.parseInt(String.valueOf(tablaOperaciones.getValueAt(tablaOperaciones.getSelectedRow(),0)));
                control.borraOperacion(num_operacion);
                this.mostrarMensaje("Operación eliminada satisfactoriamente", "Info", "Resultado de la Operación de Eliminar");
                cargarTabla();
            }
            else{
                this.mostrarMensaje("Debe seleccionar alguna Operación para eliminar", "Error", "Error al Eliminar");
            }
        }
        else{
            this.mostrarMensaje("No hay Datos para eliminar", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_jB_EliminarActionPerformed

    private void jB_VolverACalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_VolverACalculadoraActionPerformed
        Display pantalla = new Display();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jB_VolverACalculadoraActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Editar;
    private javax.swing.JButton jB_Eliminar;
    private javax.swing.JButton jB_VolverACalculadora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaOperaciones;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        String titulos[] = {"Num","Operando1","Operando2","Tipo Operación","Resultado"};
        tabla.setColumnIdentifiers(titulos);
        List<Operacion> listaOperaciones = control.traerOperaciones();
        if(listaOperaciones != null){
            for(Operacion oper:listaOperaciones ){
                Object[] objeto = {
                    oper.getId(),
                    oper.getOperando1(),
                    oper.getOperando2(),
                    oper.getTipoOperacion(),
                    oper.getResultado()
                };
                tabla.addRow(objeto);
            }
        }
        tablaOperaciones.setModel(tabla);
    }
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
}
