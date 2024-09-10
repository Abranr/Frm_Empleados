/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Empleados;

/**
 *
 * @author Andre
 */
public class Frm_empleados extends javax.swing.JFrame {
Empleados empleados;

    /**
     * Creates new form Frm_empleados
     */
    public Frm_empleados() {
        initComponents();
        empleados = new Empleados();
        tbl_empleados.setModel(empleados.leer());
        combo_puesto.setModel(empleados.leer_puesto());

    }
  public void selec_datos() {
        int fila = tbl_empleados.getSelectedRow();
        if (fila != -1) { // Asegurarse de que una fila está seleccionada
            lbl_id.setText(tbl_empleados.getValueAt(fila, 0).toString());
            txt_codigo.setText(tbl_empleados.getValueAt(fila, 1).toString());
            txt_nombres.setText(tbl_empleados.getValueAt(fila, 2).toString());
            txt_apellidos.setText(tbl_empleados.getValueAt(fila, 3).toString());
            txt_direccion.setText(tbl_empleados.getValueAt(fila, 4).toString());
            txt_telefono.setText(tbl_empleados.getValueAt(fila, 5).toString());
            txt_fn.setText(tbl_empleados.getValueAt(fila, 6).toString());
            combo_puesto.setSelectedItem(tbl_empleados.getValueAt(fila, 7).toString());
        } else {
            System.out.println("No hay fila seleccionada");
        }
}


    public void limpiar_datos() {
    lbl_id.setText("");
        txt_codigo.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_fn.setText("");
        combo_puesto.setSelectedItem("0) Elija Puesto");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_puesto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_puestos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_fn = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        combo_puesto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_puesto.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lbl_puesto.setForeground(new java.awt.Color(2, 73, 89));
        lbl_puesto.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 73, 89));
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 73, 89));
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 73, 89));
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 73, 89));
        jLabel5.setText("Direccion:");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 73, 89));
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 73, 89));
        jLabel7.setText("Fecha de Nacimiento:");

        lbl_puestos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lbl_puestos.setForeground(new java.awt.Color(2, 73, 89));
        lbl_puestos.setText("Puesto:");

        tbl_empleados.setBackground(new java.awt.Color(2, 73, 89));
        tbl_empleados.setForeground(new java.awt.Color(255, 255, 255));
        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadosMouseClicked(evt);
            }
        });
        tbl_empleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_empleadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_empleados);

        lbl_id.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lbl_id.setText("0");

        txt_codigo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        txt_nombres.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        txt_apellidos.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        txt_direccion.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        txt_telefono.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        txt_fn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        btn_agregar.setBackground(new java.awt.Color(2, 73, 89));
        btn_agregar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(201, 235, 242));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_actualizar.setBackground(new java.awt.Color(2, 73, 89));
        btn_actualizar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(201, 235, 242));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(2, 73, 89));
        btn_eliminar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(201, 235, 242));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        combo_puesto.setBackground(new java.awt.Color(150, 198, 217));
        combo_puesto.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        combo_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_puestoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(107, 176, 191));
        jLabel1.setText("Formulario Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_puesto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_id))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                        .addComponent(txt_apellidos)
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_puestos)
                                .addGap(54, 54, 54)
                                .addComponent(combo_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                                .addComponent(btn_agregar)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_puesto)
                    .addComponent(lbl_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_puestos)
                    .addComponent(btn_agregar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(combo_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
  // Crear una instancia de Empleados
    Empleados nuevoEmpleado = new Empleados();
    
    // Asignar los valores de los campos del formulario al objeto Empleados
    nuevoEmpleado.setCodigo(txt_codigo.getText());
    nuevoEmpleado.setNombres(txt_nombres.getText());
    nuevoEmpleado.setApellidos(txt_apellidos.getText());
    nuevoEmpleado.setDireccion(txt_direccion.getText());
    nuevoEmpleado.setTelefono(txt_telefono.getText());
    nuevoEmpleado.setFecha_nacimiento(txt_fn.getText());

    // Obtener el id del puesto seleccionado del combo_puesto
    String puestoSeleccionado = combo_puesto.getSelectedItem().toString();
    int posc = puestoSeleccionado.indexOf(')');
    String idPuesto = puestoSeleccionado.substring(0, posc);
    nuevoEmpleado.setid_puesto(idPuesto);
    
    // Llamar al método agregar para insertar el nuevo empleado en la base de datos
    nuevoEmpleado.agregar();
    
    // Actualizar la tabla y limpiar los campos
    tbl_empleados.setModel(nuevoEmpleado.leer());
    limpiar_datos();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void combo_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_puestoActionPerformed
        // TODO add your handling code here:
         String id_puesto= this.combo_puesto.getSelectedItem().toString();
            int posc= id_puesto.indexOf(')');
            //Integer.parseInt(id_puesto.substring(0, posc))
         lbl_puesto.setText(id_puesto.substring(0, posc)); 
    }//GEN-LAST:event_combo_puestoActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
     // Verificar si se ha ingresado un ID válido
    if (lbl_id.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar el ID del empleado para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el ID del empleado
    int idEmpleado;
    try {
        idEmpleado = Integer.parseInt(lbl_id.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear una instancia de Empleados
    Empleados empleadoActualizado = new Empleados();
    empleadoActualizado.setId(idEmpleado);
    empleadoActualizado.setCodigo(txt_codigo.getText());
    empleadoActualizado.setNombres(txt_nombres.getText());
    empleadoActualizado.setApellidos(txt_apellidos.getText());
    empleadoActualizado.setDireccion(txt_direccion.getText());
    empleadoActualizado.setTelefono(txt_telefono.getText());
    empleadoActualizado.setFecha_nacimiento(txt_fn.getText());

    // Obtener el id del puesto seleccionado del combo_puesto
    String puestoSeleccionado = combo_puesto.getSelectedItem().toString();
    int posc = puestoSeleccionado.indexOf(')');
    String idPuesto = puestoSeleccionado.substring(0, posc);
    empleadoActualizado.setid_puesto(idPuesto);

    // Llamar al método modificar para actualizar el empleado en la base de datos
    empleadoActualizado.modificar();
    
    // Actualizar la tabla y limpiar los campos
    tbl_empleados.setModel(empleadoActualizado.leer());
    limpiar_datos();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
    empleados = new Empleados();
        empleados.setId(Integer.parseInt(lbl_id.getText()));
        empleados.eliminar();
        tbl_empleados.setModel(empleados.leer());
        limpiar_datos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tbl_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadosMouseClicked
        // TODO add your handling code here:
           selec_datos();

    }//GEN-LAST:event_tbl_empleadosMouseClicked

    private void tbl_empleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_empleadosKeyReleased
        // TODO add your handling code here:
           selec_datos();

    }//GEN-LAST:event_tbl_empleadosKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_empleados().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> combo_puesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_puestos;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
