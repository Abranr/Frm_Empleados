/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andre
 */
public class Empleados extends persona {
   private String codigo, id_puesto;
    private int id;
    conexion cn;

    public Empleados() {}

    public Empleados(int id, String codigo, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String id_puesto) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.id = id;
        this.id_puesto = id_puesto;
    }

    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getid_puesto() {
        return id_puesto;
    }

    public void setid_puesto(String id_puesto) {
        this.id_puesto = id_puesto;
    }

   @Override
    public DefaultTableModel leer(){
        DefaultTableModel tabla = new DefaultTableModel();
        try{
            cn = new conexion();
            cn.abrir_conexion();
        String query = "SELECT e.id_empleados as id ,e.codigo ,e.nombres ,e.apellidos ,e.direccion ,e.telefono ,e.fecha_nacimiento ,concat(p.id_puesto,') ',p.puesto) as puesto FROM  empleados as e inner join puestos as p on e.id_puesto = p.id_puesto ;";
       ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
       String encabezado[] = 
       {"id","Codigo","Nombres","Apellidos","Direccion","Telefono","Nacimiento","Puesto"};
       tabla.setColumnIdentifiers(encabezado);
       String datos[] = new String[8];
       while (consulta.next()){
           datos[0] = consulta.getString("id");
           datos[1] = consulta.getString("codigo");
           datos[2] = consulta.getString("nombres");
           datos[3] = consulta.getString("apellidos");
           datos[4] = consulta.getString("direccion");
           datos[5] = consulta.getString("telefono");
           datos[6] = consulta.getString("fecha_nacimiento");
           datos[7] = consulta.getString("puesto");
           tabla.addRow(datos);
       }
       cn.cerrar_conexion();
    }catch(SQLException ex){
        System.out.println("Error: " + ex.getMessage() );
    
    }
    
    return tabla;
    }
    public DefaultComboBoxModel leer_puesto(){
    DefaultComboBoxModel  combo = new DefaultComboBoxModel ();
    try{
       cn = new conexion ();
       cn.abrir_conexion();
       String query;
       query = "SELECT id_puesto as id,puesto from puestos";
       ResultSet consulta =  cn.conexionBD.createStatement().executeQuery(query);
       combo.addElement("0) Elija Puesto");
                  while (consulta.next())
                    {            
                      combo.addElement(consulta.getString("id")+") "+consulta.getString("puesto"));
                    }
              cn.cerrar_conexion();
              
       
    }catch(SQLException ex){
        System.out.println("Error: " + ex.getMessage() );
    }
    return combo;
    }
    @Override
   public void agregar (){
      try{
          PreparedStatement parametro;
          cn = new conexion();
          cn.abrir_conexion();
          String query = "insert into empleados(codigo,nombres,apellidos,direccion,telefono,fecha_nacimiento, id_puesto) " +
                         "values(?,?,?,?,?,?,?);";
          parametro  = (PreparedStatement) cn.conexionBD.prepareStatement(query);
          parametro.setString(1, getCodigo());
          parametro.setString(2, getNombres());
          parametro.setString(3, getApellidos());
          parametro.setString(4, getDireccion());
          parametro.setString(5, getTelefono());
          parametro.setString(6, getFecha_nacimiento());
          parametro.setString(7, getid_puesto());  // Added missing parameter
          
          int executar= parametro.executeUpdate();
          cn.cerrar_conexion();
          JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Registro Ingresado",
              "Mensaje", JOptionPane.INFORMATION_MESSAGE);
      }catch(HeadlessException | SQLException ex){
          System.out.println("Error: " + ex.getMessage());
      }
  }

       @Override
public void modificar(){
    try{
        PreparedStatement parametro;
        cn = new conexion();
        cn.abrir_conexion();
        String query = "update empleados set codigo = ?,nombres= ?,apellidos= ?,direccion= ?,telefono= ?,fecha_nacimiento= ? , id_puesto = ? " +
                       "where id_empleados = ?";
        parametro  = (PreparedStatement) cn.conexionBD.prepareStatement(query);
        parametro.setString(1, getCodigo());
        parametro.setString(2, getNombres());
        parametro.setString(3, getApellidos());
        parametro.setString(4, getDireccion());
        parametro.setString(5, getTelefono());
        parametro.setString(6, getFecha_nacimiento());
        parametro.setString(7, getid_puesto());  // Added missing parameter
        parametro.setInt(8, getId()); // Set the id_empleado for WHERE clause
        
        int executar = parametro.executeUpdate();
        cn.cerrar_conexion();
        JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Registro Actualizado",
            "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }catch(HeadlessException | SQLException ex){
        System.out.println("Error: " + ex.getMessage());
    }
}



    @Override
  public void eliminar(){
      try{
          PreparedStatement parametro;
          cn = new conexion();
          cn.abrir_conexion();
          String query = "delete from empleados where id_empleados = ?";  // Fixed table name and id_empleado
          parametro  = (PreparedStatement) cn.conexionBD.prepareStatement(query);
          parametro.setInt(1, getId());
          
          int executar = parametro.executeUpdate();
          cn.cerrar_conexion();
          JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Registro Eliminado",
              "Mensaje", JOptionPane.INFORMATION_MESSAGE);
      }catch(HeadlessException | SQLException ex){
          System.out.println("Error: " + ex.getMessage());
      }
  }

    public void setId_puesto(int id_puesto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
