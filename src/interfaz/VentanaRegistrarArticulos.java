package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistrarArticulos extends javax.swing.JFrame implements Observer {

    public VentanaRegistrarArticulos(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        modelo.addObserver(this);
        definirTabla();
        agregarEnTablaArticulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NombreArticulo = new javax.swing.JTextField();
        DescripcionArticulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AgregarArticulo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaArticulo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulos");
        getContentPane().setLayout(null);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Descripción: ");

        AgregarArticulo.setText("Agregar");
        AgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarArticuloActionPerformed(evt);
            }
        });

        TablaArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción"
            }
        ));
        TablaArticulo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TablaArticuloComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(TablaArticulo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(DescripcionArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescripcionArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(AgregarArticulo)
                        .addGap(56, 56, 56))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 950, 200);

        setBounds(0, 0, 963, 234);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarArticuloActionPerformed
        //agregar articulo
        String nombre = NombreArticulo.getText();
        String descripcion = DescripcionArticulo.getText();
        
        if(!incompleto()){
            if (modelo.nombreArticuloRepetido(nombre)) {
                JOptionPane.showMessageDialog(null, "Error: el nombre ingresado ya se encuentra en la tabla",
                        "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            } else {
                Articulo articulo = new Articulo(nombre, descripcion);
                modelo.agregarArticulo(articulo);
                agregarEnTablaArticulo();
                vaciar();
            }
        }
         
    }//GEN-LAST:event_AgregarArticuloActionPerformed

    private void TablaArticuloComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaArticuloComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaArticuloComponentAdded

    public void definirTabla(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripcion");
        TablaArticulo.setModel(modeloTabla);
    }
    
    public boolean incompleto(){
        //si algun campo esta vacio, lo indica
        boolean ok = false;
        if(NombreArticulo.getText().equals("") || DescripcionArticulo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Error: Faltan datos por ingresar",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
            ok = true;
        }
        return ok;
    }
    
    public void agregarEnTablaArticulo() {
        //añade el articulo a la tabla
        modelo.limpiarTabla(TablaArticulo);
        for (int i = 0; i < modelo.getListaArticulos().size(); i++) {
            Articulo art = modelo.getListaArticulos().get(i);
            agregarFila();
            for (int j = 0; j < 2; j++) {
                
                switch (j) {
                    case 0:
                        TablaArticulo.setValueAt(art.getNombreArticulo(), i, j);
                        break;
                    default:
                        TablaArticulo.setValueAt(art.getDescripcionArticulo(), i, j);
                        break;
                }
            }
        }
    }

    public void agregarFila() {
        //agrega una fila en la tabla
        System.out.println("agregar fila");
        String fil[] = {"", ""};
        modeloTabla.addRow(fil);
    }

    public void vaciar() {
        //vaciar los campos de texto
        NombreArticulo.setText("");
        DescripcionArticulo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarArticulo;
    private javax.swing.JTextField DescripcionArticulo;
    private javax.swing.JTextField NombreArticulo;
    private javax.swing.JTable TablaArticulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private DefaultTableModel modeloTabla;

    @Override
    public void update(Observable o, Object arg) {
        agregarEnTablaArticulo();
    }
}
